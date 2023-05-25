const val CommissionPer: Float = 0.75F
const val CommissionMin: Int = 35
fun main(){

    println("Комиссия: "+commissionPrice(100)+" руб.");
    println("Понравилось "+outputNumberPeople(61));
    println("Сумма покупки: "+discountMusic(15000,true)+" руб.");
}

fun commissionPrice(amount: Int):Int{
    return if (amount<CommissionMin) -1
    else if ((amount*CommissionPer).toInt()<CommissionMin) CommissionMin else (amount*CommissionPer).toInt()
}

fun outputNumberPeople(likes: Int):String {
    return if (likes % 2==1){
        "$likes человеку"
    } else
        "$likes людям"
}
fun discountMusic(purchaseAmount: Int,regularСustomer:Boolean): Double {
    var discountedAmount: Double;
    discountedAmount = if (purchaseAmount>10_000){
        purchaseAmount-(purchaseAmount*0.05)
    } else if (purchaseAmount>1000){
        (purchaseAmount-100).toDouble()
    } else {
        purchaseAmount.toDouble();
    }
    if (regularСustomer){
        discountedAmount -= (discountedAmount * 0.01)
    }
    return discountedAmount;
}