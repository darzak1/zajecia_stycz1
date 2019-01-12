import pl.edu.wszib.java.PackagePresenter;
import static java.lang.Math.*;

public class PackageTester {
    public static void main(String[] args) {
        System.out.println("Pakiet: " + PackageTester.class.getPackage());

        PackagePresenter javaPackagePresenter = new PackagePresenter();
        pl.edu.wszib.podyplomowe.PackagePresenter podyplomePackagePresenter = new pl.edu.wszib.podyplomowe.PackagePresenter();

        javaPackagePresenter.showPackage();
        podyplomePackagePresenter.showPackage();
        System.out.println(Math.PI);
    }

}
