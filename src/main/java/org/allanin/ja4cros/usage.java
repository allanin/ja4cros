public class usage
{

       public static void help ()
       {
        System.out.println("");
        System.out.println("ja4cros - Java based package manager for Chrome OS");
        System.out.println("");
        System.out.println("http://allanin.github.io/ja4cros");
        System.out.println("");
        System.out.println("Usage:");
        System.out.println("  ja4cros build [-k|--keep] [-v|--verbose] <name> ...");
        System.out.println("  ja4cros download [-v|--verbose] <name> ...");
        System.out.println("  ja4cros files <name> ...");
        System.out.println("  ja4cros help [<command>]");
        System.out.println("  ja4cros install [-k|--keep] [-s|--build-from-source] [-v|--verbose] <name> ...");
        System.out.println("  ja4cros list (available|installed)");
        System.out.println("  ja4cros remove [-v|--verbose] <name> ...");
        System.out.println("  ja4cros search [-v|--verbose] [<name> ...]");
        System.out.println("  ja4cros update");
        System.out.println("  ja4cros upgrade [-k|--keep] [-s|--build-from-source] [-v|--verbose] [<name> ...]");
        System.out.println("  ja4cros whatprovides <name> ...");
        System.out.println("");
        System.out.println("  -k --keep               Keep the `JA4CROS_DIR` directory.");
        System.out.println("  -s --build-from-source  Build from source even if pre-compiled binary exists.");
        System.out.println("  -V --version            Display the ja4cros version.");
        System.out.println("  -v --verbose            Show extra information.");
        System.out.println("  -h --help               Show this screen.");
        System.out.println("");
       }
}
