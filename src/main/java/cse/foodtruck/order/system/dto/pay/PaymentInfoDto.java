package cse.foodtruck.order.system.dto.pay;


import lombok.*;

@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentInfoDto {
    public String cardNumber; //16자리
    public String cardPw; //2자리
    public String cvc; //3자리
    public String dateofExpiry; //4자리
    public String Installment; //할부개월수

}
