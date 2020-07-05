package fundamentals_coding.computer;

import utils.RandomGenerator;
import java.time.LocalDate;

public class ComputerMain {
    public static void main(String[] args) {
        Computer[] computers = initializeComputer(500);

        //print all:
        for (Computer computer : computers) {
            System.out.println(computer.toString());
        }

        Color colorToSearch = Color.BLACK;
        String nameEndsWith = "L";


        // prints computer list those maker name ends with specified chars
        System.out.printf("%n%nComputers whose maker's name ends with \"%s\" :%n", nameEndsWith);
        for (Computer pc : ComputerUtils.findByEndOfName(nameEndsWith, computers)) {
            System.out.printf("%n%s", pc);
        }


        //print cheapest, print oldest, how many are black(color)
        System.out.printf("%n%nCheapest computer: %s%n" +
                        "%nOldest made: %s Date made: %s%n" +
                        "%nThere are %d computers in the list, whose color is %s%n",
                ComputerUtils.findCheapest(computers),
                ComputerUtils.findOldest(computers), ComputerUtils.findOldest(computers).getMadeYear(),
                ComputerUtils.countByColor(computers, colorToSearch),
                colorToSearch);

        //
//        System.out.println(stringToUpperCase(
//                "ABS Computer Technologies (Parent: Newegg)\n" +
//                "Acer\n" +
//                "Achim\n" +
//                "AG Neovo\n" +
//                "Alphabet Inc.\n" +
//                "Amiga, Inc.\n" +
//                "ACube Systems Srl\n" +
//                "Hyperion Entertainment\n" +
//                "Aigo\n" +
//                "AMD\n" +
//                "Aleutia\n" +
//                "Alienware (Parent: Dell)\n" +
//                "AMAX Information Technologies\n" +
//                "AOpen\n" +
//                "Apple\n" +
//                "ASRock\n" +
//                "Asus\n" +
//                "AVADirect\n" +
//                "AXIOO International\n" +
//                "BenQ\n" +
//                "Biostar\n" +
//                "Brother Industries\n" +
//                "Burroughs Corporation\n" +
//                "Chassis Plans\n" +
//                "Chip PC\n" +
//                "Cisco Systems\n" +
//                "Clevo\n" +
//                "Cray\n" +
//                "Crystal Group\n" +
//                "Compal\n" +
//                "Compaq\n" +
//                "Cooler Master\n" +
//                "CyberPowerPC\n" +
//                "Dai-Tech\n" +
//                "Data General\n" +
//                "Dell\n" +
//                "Wyse Technology\n" +
//                "DFI\n" +
//                "Digital Equipment Corporation\n" +
//                "Digital Storm\n" +
//                "DTK\n" +
//                "Elitegroup Computer Systems (ECS)\n" +
//                "Epson\n" +
//                "Evans & Sutherland\n" +
//                "Everex\n" +
//                "EVGA\n" +
//                "Falcon Northwest\n" +
//                "FIC\n" +
//                "Fujitsu\n" +
//                "Foxconn\n" +
//                "Founder Technology\n" +
//                "Gigabyte\n" +
//                "Aorus\n" +
//                "Google\n" +
//                "GoPro\n" +
//                "Gradiente\n" +
//                "Groupe Bull\n" +
//                "Grundig (Parent: Arçelik)\n" +
//                "Hasee\n" +
//                "HCL\n" +
//                "Hewlett Packard Enterprise\n" +
//                "HP Inc. (formerly Hewlett-Packard)\n" +
//                "Fortify Software\n" +
//                "HP Autonomy\n" +
//                "Silicon Graphics International\n" +
//                "Hitachi\n" +
//                "HTC\n" +
//                "Huawei\n" +
//                "Hyundai\n" +
//                "IBM\n" +
//                "Intel\n" +
//                "Inventec\n" +
//                "Itautec\n" +
//                "IGEL\n" +
//                "Jetta International\n" +
//                "Kohjinsha\n" +
//                "Kontron AG\n" +
//                "Lanix\n" +
//                "Lanner Electronics\n" +
//                "LanSlide Gaming PCs\n" +
//                "Lenovo\n" +
//                "Medion\n" +
//                "LG\n" +
//                "LiteOn\n" +
//                "Maingear\n" +
//                "Meebox\n" +
//                "Mesh Computers\n" +
//                "Microsoft\n" +
//                "Micro-Star International (MSI)\n" +
//                "Micro Center\n" +
//                "Myria\n" +
//                "MiTAC\n" +
//                "Motion Computing\n" +
//                "Monel\n" +
//                "Motorola\n" +
//                "NComputing\n" +
//                "NCR\n" +
//                "NEC\n" +
//                "Nvidia\n" +
//                "NZXT\n" +
//                "NeXT\n" +
//                "Olidata\n" +
//                "Olivetti\n" +
//                "Oracle\n" +
//                "Origin PC\n" +
//                "Panasonic\n" +
//                "Positivo Informática\n" +
//                "Premium PCs\n" +
//                "Puget Systems\n" +
//                "Quanta Computer\n" +
//                "RCA\n" +
//                "Razer\n" +
//                "Samsung\n" +
//                "Sapphire Technology\n" +
//                "Shuttle\n" +
//                "SGI\n" +
//                "Síragon\n" +
//                "Sony\n" +
//                "Supermicro\n" +
//                "Systemax\n" +
//                "System76\n" +
//                "T-Platforms\n" +
//                "TabletKiosk\n" +
//                "Tadpole Computer\n" +
//                "Tatung\n" +
//                "Toshiba\n" +
//                "Tyan\n" +
//                "Unisys\n" +
//                "V3 Gaming PC\n" +
//                "Vaio\n" +
//                "Velocity Micro\n" +
//                "Overdrive PC\n" +
//                "Vestel\n" +
//                "VIA Technologies\n" +
//                "ViewSonic\n" +
//                "Viglen\n" +
//                "Vizio\n" +
//                "Valve\n" +
//                "Wistron\n" +
//                "Wortmann\n" +
//                "Xiaomi\n" +
//                "Zelybron\n" +
//                "Zoostorm\n" +
//                "Zotac\n"));
    }

    //
    public static Computer[] initializeComputer(int size) {
        Computer[] computers = new Computer[size];

        int priceMin = 200;
        int priceMax = 12000;
        Color[] colors = {
                Color.BLACK,
                Color.WHITE,
                Color.BLACK,
                Color.ORANGE,
                Color.YELLOW,
                Color.GREEN,
                Color.INDIGO,
                Color.BLUE,
                Color.VIOLET};

        ComputerMaker[] makers = {
                ComputerMaker.ABS_COMPUTER_TECHNOLOGIES, ComputerMaker.ACER, ComputerMaker.ACHIM, ComputerMaker.AG_NEOVO, ComputerMaker.ALPHABET_INC, ComputerMaker.AMIGA_INC, ComputerMaker.ACUBE_SYSTEMS_SRL,
                ComputerMaker.HYPERION_ENTERTAINMENT, ComputerMaker.AIGO, ComputerMaker.AMD, ComputerMaker.ALEUTIA, ComputerMaker.ALIENWARE, ComputerMaker.AMAX_INFORMATION_TECHNOLOGIES, ComputerMaker.AOPEN, ComputerMaker.APPLE,
                ComputerMaker.ASROCK, ComputerMaker.ASUS, ComputerMaker.AVADIRECT, ComputerMaker.AXIOO_INTERNATIONAL, ComputerMaker.BENQ,
                ComputerMaker.BIOSTAR, ComputerMaker.BROTHER_INDUSTRIES, ComputerMaker.BURROUGHS_CORPORATION, ComputerMaker.CHASSIS_PLANS, ComputerMaker.CHIP_PC, ComputerMaker.CISCO_SYSTEMS, ComputerMaker.CLEVO,
                ComputerMaker.CRAY, ComputerMaker.CRYSTAL_GROUP, ComputerMaker.COMPAL, ComputerMaker.COMPAQ, ComputerMaker.COOLER_MASTER, ComputerMaker.CYBERPOWERPC, ComputerMaker.DAI_TECH, ComputerMaker.DATA_GENERAL, ComputerMaker.DELL,
                ComputerMaker.WYSE_TECHNOLOGY, ComputerMaker.DFI, ComputerMaker.DIGITAL_EQUIPMENT_CORPORATION, ComputerMaker.DIGITAL_STORM, ComputerMaker.DTK, ComputerMaker.ELITEGROUP_COMPUTER_SYSTEMS,
                ComputerMaker.EPSON, ComputerMaker.EVANS_SUTHERLAND, ComputerMaker.EVEREX, ComputerMaker.EVGA, ComputerMaker.FALCON_NORTHWEST, ComputerMaker.FIC,
                ComputerMaker.FUJITSU, ComputerMaker.FOXCONN, ComputerMaker.FOUNDER_TECHNOLOGY, ComputerMaker.GIGABYTE, ComputerMaker.AORUS, ComputerMaker.GOOGLE, ComputerMaker.GOPRO, ComputerMaker.GRADIENTE,
                ComputerMaker.GROUPE_BULL, ComputerMaker.GRUNDIG, ComputerMaker.HASEE, ComputerMaker.HCL, ComputerMaker.HEWLETT_PACKARD_ENTERPRISE, ComputerMaker.HP_INC, ComputerMaker.FORTIFY_SOFTWARE,
                ComputerMaker.HP_AUTONOMY, ComputerMaker.SILICON_GRAPHICS_INTERNATIONAL, ComputerMaker.HITACHI, ComputerMaker.HTC, ComputerMaker.HUAWEI, ComputerMaker.HYUNDAI, ComputerMaker.IBM, ComputerMaker.INTEL, ComputerMaker.INVENTEC,
                ComputerMaker.ITAUTEC, ComputerMaker.IGEL, ComputerMaker.KOHJINSHA, ComputerMaker.KONTRON_AG, ComputerMaker.LANIX, ComputerMaker.LANNER_ELECTRONICS, ComputerMaker.LANSLIDE_GAMING_PCS, ComputerMaker.LENOVO, ComputerMaker.MEDION,
                ComputerMaker.LG, ComputerMaker.LITEON, ComputerMaker.MAINGEAR, ComputerMaker.MEEBOX, ComputerMaker.MESH_COMPUTERS, ComputerMaker.MICROSOFT, ComputerMaker.MICRO_STAR_INTERNATIONAL, ComputerMaker.MICRO_CENTER,
                ComputerMaker.MYRIA, ComputerMaker.MITAC, ComputerMaker.MOTION_COMPUTING, ComputerMaker.MONEL, ComputerMaker.MOTOROLA, ComputerMaker.NCOMPUTING, ComputerMaker.NCR,
                ComputerMaker.NEC, ComputerMaker.NVIDIA, ComputerMaker.NZXT, ComputerMaker.OLIDATA, ComputerMaker.OLIVETTI, ComputerMaker.ORACLE, ComputerMaker.ORIGIN_PC, ComputerMaker.PANASONIC, ComputerMaker.POSITIVO_INFORMATICA,
                ComputerMaker.PUGET_SYSTEMS, ComputerMaker.QUANTA_COMPUTER, ComputerMaker.RCA, ComputerMaker.RAZER, ComputerMaker.SAMSUNG, ComputerMaker.SAPPHIRE_TECHNOLOGY, ComputerMaker.SHUTTLE, ComputerMaker.SGI,
                ComputerMaker.SIRAGON, ComputerMaker.SONY, ComputerMaker.SUPERMICRO, ComputerMaker.SYSTEMAX, ComputerMaker.SYSTEM76, ComputerMaker.T_PLATFORMS, ComputerMaker.TABLETKIOSK, ComputerMaker.TADPOLE_COMPUTER, ComputerMaker.TATUNG,
                ComputerMaker.TOSHIBA, ComputerMaker.TYAN, ComputerMaker.UNISYS, ComputerMaker.V3_GAMING_PC, ComputerMaker.VAIO, ComputerMaker.VELOCITY_MICRO,
                ComputerMaker.OVERDRIVE_PC, ComputerMaker.VESTEL, ComputerMaker.VIA_TECHNOLOGIES, ComputerMaker.VIEWSONIC, ComputerMaker.VIGLEN, ComputerMaker.VIZIO, ComputerMaker.VALVE, ComputerMaker.WISTRON,
                ComputerMaker.WORTMANN, ComputerMaker.XIAOMI, ComputerMaker.ZELYBRON, ComputerMaker.ZOOSTORM, ComputerMaker.ZOTAC
        };

        for (int i = 0; i < size; i++) {
            computers[i] = new Computer(makers[RandomGenerator.generateRandomInteger(0, 60)],
                    colors[RandomGenerator.generateRandomInteger(0, 8)],
                    LocalDate.now().minusMonths(RandomGenerator.generateRandomInteger(0, 120)),
                    RandomGenerator.generateRandomDouble(priceMin, priceMax));
        }
        return computers;
    }
//
//        }
//        return pcs;
//    public static String stringToUpperCase(String input) {
//        return input.toUpperCase().replaceAll(" ", "_")
//                .replaceAll(",","")
//                .replaceAll("\n",",\n")
//                .replaceAll(":","");
//    }
}



