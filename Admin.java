public class Admin extends Pengguna {
    private String username;
    private String password;

    public Admin(String id, String nama, String username, String password) {
        super(id, nama);
        this.username = username;
        this.password = password;
    }

    public boolean login(String u, String p) {
        return username.equals(u) && password.equals(p);
    }

    @Override
    public void tambahData() {
        System.out.println("Admin tidak menambah data admin baru melalui menu ini.");
    }

    @Override
    public void lihatData() {
        System.out.println("Admin: " + nama + " (" + username + ")");
    }
}
