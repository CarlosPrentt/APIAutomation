package persistence;

import pojo.User;

public class InicializeData {
    public static User loadUsers() {
        User user = new User(4567, "Camilo", "Rodriguez", 1008765, 500000,
                "Save", "camilo05@gmail.com", true, "Colombia", "3243542312");
        User user2 = new User(1234, "Cecilia", "Martinez", 4523141, 1000000,
                "Retire", "ceci02@gmail.com", true, "Colombia", "3241234352");
        User user3 = new User(5423, "Concha", "Ramirez", 1623451, 150000,
                "Save", "conchis@gmail.com", true, "Canadá", "3562431234");
        User user4 = new User(5678, "Fabian", "Moreno", 1652309, 1200000,
                "Save", "fabiancho05@gmail.com", true, "Venezuela", "3241234567");
        User user5 = new User(2345, "Gabriel", "Torres", 7891534, 2000000,
                "Transfer", "gabo05@gmail.com", true, "Francia", "3241325674");
        User user6 = new User(2312, "Doris", "Monrroy", 5613425, 300000,
                "Retire", "nadaremos@gmail.com", true, "Perú", "3123212321");
        User user7 = new User(1122, "Ernesto", "Hernandez", 9876543, 5000000,
                "Pay", "ernes@gmail.com", true, "Ecuador", "3787675767");
        User user8 = new User(1231, "Tatiana", "Fernandez", 1234567, 100000,
                "Pay", "tati.f@gmail.com", true, "Angentina", "3245465463");
        User user9 = new User(6721, "Willson", "Guzmán", 1324536, 200000,
                "Retire", "Willy@gmail.com", true, "Japón", "3653457865");
        User user10 = new User(8432, "Junior", "Restrepo", 9863456, 1500000,
                "Save", "juniorres@gmail.com", true, "E.U", "3150902234");
        return user;
    }
}
