
public class Gerente extends Funcionario {

    private String passWord;

    public Gerente(String passWord) {
        this.passWord = passWord;
    }

    public boolean login(String passWord) {
        boolean verified = false;
        if (this.passWord == passWord) {
            verified = true;
        }
        return verified;
    }

    @Override
    public double getBonus() {
        return this.getSalary();
    }
}
