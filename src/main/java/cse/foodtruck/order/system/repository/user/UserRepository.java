package cse.foodtruck.order.system.repository.user;

import cse.foodtruck.order.system.dto.user.UserDto;
import cse.foodtruck.order.system.entity.user.User;
import cse.foodtruck.order.system.repository.base.CrudRepository;

import java.sql.SQLException;
import java.util.Objects;

public class UserRepository extends CrudRepository<User, String> {
    public UserRepository() {
        super.setEntity(new User());
    }

    //유저 Id 찾기 메소드
    public User findIdByEmailAndName(String email, String name){
        String sql = String.format("SELECT * FROM user WHERE EMAIL = \"%s\" AND NAME = \"%s\";", email, name);
        User user = null;
        try{
            this.rs = this.excuteQuery(sql);
            user = this.resultSetToEntity(rs);

            return user;
        } finally {
            db.close();
        }
    }

    public User findPwByEmailAndId(String email, String id) {
        String sql = String.format("SELECT * FROM user WHERE EMAIL = \"%s\" AND ID = \"%s\";", email, id);
        User user = null;
        try{
            this.rs = this.excuteQuery(sql);
            user = this.resultSetToEntity(rs);

            return user;
        } finally {
            db.close();
        }
    }

}

