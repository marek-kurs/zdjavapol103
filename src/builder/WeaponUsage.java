package builder;

public class WeaponUsage {
    public static void main(String[] args) {
//        new builder.Weapon("machine gun","uzi", 44,4.0,null);
        Weapon.Builder weaponBuilder = new Weapon.Builder();
        Weapon weapon = weaponBuilder
                .withName("machine gun")
                .withType("uzi")
                .withDamage(44)
                .withDurability((long) 4.0)
                .build();

        StringBuilder sb = new StringBuilder();
        sb.append("cyfry");
        for (int i = 0; i< 10 ; i++){
            sb.append(i);
            sb.append(", ");
        }
        System.out.println(sb.toString());
    }
}
