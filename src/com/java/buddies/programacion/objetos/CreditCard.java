package com.java.buddies.programacion.objetos;

public class CreditCard {
    public CreditCard(int cardNumber, String expirationDate, int securityCode, String nameHolder, double creditLimit, double balance, int progress) {

        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.nameHolder = nameHolder;
        this.creditLimit = creditLimit;
        this.balance = balance;
        this.amount = balance;
        this.rewards = 0;
        this.progress = progress;
        this.requiredUsesForReward = DEFAULT_REQUIRED_USES_FOR_REWARD;
    }


    private static final int DEFAULT_REQUIRED_USES_FOR_REWARD = 22;

    private int cardNumber;
    private String expirationDate;
    private int securityCode;
    private String nameHolder;
    private double creditLimit;
    private double balance;
    private double amount;
    private int rewards;
    private int progress;
    private int requiredUsesForReward;

    public int getRewards() {
        return rewards;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setRequiredUsesForReward(int requiredUsesForReward) {
        this.requiredUsesForReward = requiredUsesForReward;
    }
    public void setProgress(int progress){
        this.progress = progress;
    }

    public void progress() {
        this.rewards++;

        if (this.rewards == requiredUsesForReward) {
            this.balance += 230;
            System.out.println("El usuario ha usado su tarjeta " + requiredUsesForReward + " veces, recompensa aplicada. Nuevo saldo: " + this.balance);
        }
        if (this.rewards < requiredUsesForReward) {
            System.out.println("Para aplicar una recompensa como minimo debe usarlo 22 veces. " + this.rewards + ".");
        }
    }

    public void checkRewardStatus() {
        if (this.rewards < requiredUsesForReward) {
            System.out.println("No aplica ninguna recompensa. Debe usar su tarjeta al menos " + requiredUsesForReward + " veces. Usos actuales: " + this.rewards + ".");
        }
    }
    public void depositAmount(double deposit) {
        if (deposit < 0) {
            throw new IllegalArgumentException("El monto a depositar no puede ser negativo.");

        }
        updateBalance(deposit);
        System.out.println("El monto recibido es de " + deposit + " por lo tanto, el saldo actual acumulado es: " + getBalance());

    }
    public double updateBalance(double accumulate) {
        this.balance += accumulate;
        return this.balance;
    }


        @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", expirationDate='" + expirationDate + '\'' +
                ", securityCode=" + securityCode +
                ", nameHolder='" + nameHolder + '\'' +
                ", creditLimit=" + creditLimit +
                ", balance=" + balance +
                ", amount=" + amount +
                ", rewards=" + rewards +
                '}';
    }
}


