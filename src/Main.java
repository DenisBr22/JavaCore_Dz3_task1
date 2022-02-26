import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String rootDirectory = "D://Games/";
        StringBuilder log = new StringBuilder();

        File dir1 = new File(rootDirectory + "src");
        File dir2 = new File(rootDirectory + "res");
        File dir3 = new File(rootDirectory + "savegames");
        File dir4 = new File(rootDirectory + "temp");

        if (dir1.mkdir()) {
            log.append("Каталог «src» создан. ");
        }
        if (dir2.mkdir()) {
            log.append("Каталог «res» создан. ");
        }
        if (dir3.mkdir()) {
            log.append("Каталог «savegames» создан. ");
        }
        if (dir4.mkdir()) {
            log.append("Каталог «temp» создан. ");
        }

        File newDirSrc = new File(rootDirectory + "src/main");
        File newDirSrc2 = new File(rootDirectory + "src/test");

        if (newDirSrc.mkdir()) {
            log.append("Подкаталог «main» создан. ");
        }
        if (newDirSrc2.mkdir()) {
            log.append("Подкаталог «test» создан. ");
        }

        File newDirRes = new File(rootDirectory + "res/drawables");
        File newDirRes2 = new File(rootDirectory + "res/vectors");
        File newDirRes3 = new File(rootDirectory + "res/icons");

        if (newDirRes.mkdir()) {
            log.append("Подкаталог «drawables» создан. ");
        }
        if (newDirRes2.mkdir()) {
            log.append("Подкаталог «vectors» создан. ");
        }
        if (newDirRes3.mkdir()) {
            log.append("Подкаталог «icons» создан. ");
        }

        File fileMain = new File(rootDirectory + "src/main", "Main.java");
        try {
            if (fileMain.createNewFile())
                log.append("Файл «Main.java» cоздан. ");
        } catch (IOException ex) {
            System.out.println("Файл не создан. ");
        }

        File fileUtils = new File(rootDirectory + "src/main", "Utils.java");
        try {
            if (fileUtils.createNewFile())
                log.append("Файл «Utils.java» cоздан. ");
        } catch (IOException ex) {
            System.out.println("Файл не создан. ");
        }

        File fileTemp = new File(rootDirectory + "temp", "temp.txt");
        try {
            if (fileTemp.createNewFile())
                log.append("Файл «temp.txt» cоздан. ");
        } catch (IOException ex) {
            System.out.println("Файл не создан. ");
        }

        try (FileWriter writer = new FileWriter(rootDirectory + "temp/temp.txt", false)) {
            writer.write(log.toString());
            writer.flush();
        } catch (IOException ex) {
            System.out.println("Файл не записан!");
        }
    }
}
