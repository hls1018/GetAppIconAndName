public class GetAppPackageInfoUtils {

    /**
    * 获取程序 图标
    */
    public static Drawable getAppIcon(Context context, String pkgName) {
        try {
            if (null != pkgName) {
                PackageManager pm =context.getPackageManager();
                ApplicationInfo info = pm.getApplicationInfo(pkgName, 0);
                return info.loadIcon(pm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取程序的名字
     */
    public static String getAppName(Context context, String packname){
        try {
            if (null != packname) {
                PackageManager pm = context.getPackageManager();
                ApplicationInfo info = pm.getApplicationInfo(packname, 0);
                return info.loadLabel(pm).toString();
            }
        } catch (PackageManager.NameNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        return null;
    }


}
