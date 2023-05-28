package cse.foodtruck.order.system.service.user;

import cse.foodtruck.order.system.dto.user.*;
import cse.foodtruck.order.system.entity.user.User;
import cse.foodtruck.order.system.pattern.observer.DataCollection;
import cse.foodtruck.order.system.repository.user.UserRepository;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class UserService {
    private UserRepository userRepository;
    private UserData userData;
    public UserService(){
        //생성자에서 userRepository를 초기화
        this.userRepository = new UserRepository();
    }
    public UserDto login(UserLoginDto dto){
        //dto를 entity로 변환
        User user = User.toEntity(dto);
        //해당 아이디가 있는지 확인
        User target = userRepository.findById(user.getId());
        userData = DataCollection.getInstance().getUserData();
        //해당 아이디가 없으면 null 반환
        if(target == null) return null;

        //해당 아이디가 있으면 비밀번호가 맞는지 확인
        //맞으면 dto로 변환해서 반환
        if(target.getPw().equals(user.getPw())){
            //옵저버 상태 변경
            DataCollection.getInstance().getUserData().setStatus(UserDto.createDto(target));
            System.out.println("옵저버 상태 변경");
            return UserDto.createDto(target);
        } else{
            return null;
        }
    }

    public UserDto signUp(UserSignUpDto dto){
        //중복확인 버튼 사용
        //User target = userRepository.findById(dto.getId());
        //if(target == null) return null;
        User user = new User(dto.getId(), dto.getNewPw(), dto.getName(), dto.getEmail(), dto.getSignUpDate(), dto.getForm(), dto.getBalance());

        userRepository.save(user);

        User result = userRepository.findById(dto.getId()); //회원가입 저장 확인

        if(result == null) return null;
        else return UserDto.createDto(result);
    }

    public UserDto idCheck(String id){
        User target = userRepository.findById(id);
        if(target == null) return null;
        else return UserDto.createDto(target);
    }

    public UserDto findIdByEmailAndName(UserIdCheckDto dto){
        User user = User.toEntity(dto);
        User target = userRepository.findIdByEmailAndName(user.getEmail(), user.getName());

        if(target == null){
            return null;
        }
        else return UserDto.createDto(target);
    }

    public UserDto findPwByEmailAndId(UserPwFindDto dto){
        User user = User.toEntity(dto);
        User target = userRepository.findPwByEmailAndId(user.getEmail(), user.getId());
        if(target == null){
            return null;
        }
        else return UserDto.createDto(target);
    }

    public ArrayList<UserDto> getUserList(){
        ArrayList<User> userList = userRepository.findAll();
        ArrayList<UserDto> resultList = new ArrayList<>();
        for(User user : userList){
            resultList.add(UserDto.createDto(user));
        }

        return resultList;
    }

    public boolean deleteUser(String id){
        return userRepository.deleteById(id);

    }

    public ArrayList<UserDto> getUserListBySearch(String searchType, String searchWord){
        ArrayList<User> userList = userRepository.findBySearch(searchType, searchWord);
        ArrayList<UserDto> resultList = new ArrayList<>();
        for(User user : userList){
            resultList.add(UserDto.createDto(user));
        }

        return resultList;
    }

    public UserDto updateUserInfo(UserUpdateDto dto){
        User user = User.toEntity(dto);

        UserDto result = UserDto.createDto(userRepository.update(user));
        if(result == null) return null;
        else return result;
    }

}
