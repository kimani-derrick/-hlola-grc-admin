package Z1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: q  reason: collision with root package name */
    public static final e f4553q;

    /* renamed from: r  reason: collision with root package name */
    public static final e f4554r;

    /* renamed from: s  reason: collision with root package name */
    public static final e f4555s;

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ e[] f4556t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Z1.e] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Z1.e] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Z1.e] */
    static {
        ?? r3 = new Enum("NETWORK_UNMETERED", 0);
        f4553q = r3;
        ?? r42 = new Enum("DEVICE_IDLE", 1);
        f4554r = r42;
        ?? r5 = new Enum("DEVICE_CHARGING", 2);
        f4555s = r5;
        f4556t = new e[]{r3, r42, r5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f4556t.clone();
    }
}
