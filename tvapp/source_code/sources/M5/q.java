package M5;
/* loaded from: classes.dex */
public final class q {
    public static String a(e eVar) {
        String obj = eVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
