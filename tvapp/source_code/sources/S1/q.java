package S1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: q  reason: collision with root package name */
    public static final q f3127q;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ q[] f3128r;
    /* JADX INFO: Fake field, exist only in values array */
    q EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, S1.q] */
    static {
        Enum r22 = new Enum("UNKNOWN", 0);
        ?? r3 = new Enum("ANDROID_FIREBASE", 1);
        f3127q = r3;
        f3128r = new q[]{r22, r3};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f3128r.clone();
    }
}
