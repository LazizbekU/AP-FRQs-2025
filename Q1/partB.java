public int dogWalkShift(int startHour, int endHour) {
    int money = 0;
    for (int i = startHour; i <= endHour; i++) {
        int walked = walkDogs(i);
        int pay = walked * 5;
        if (walked == maxDogs || (i >= 9 && i <= 17)) {
            pay += 3;
        }
        money += pay;
    }
    return money;
}
