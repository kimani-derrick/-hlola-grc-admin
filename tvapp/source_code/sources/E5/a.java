package E5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: q  reason: collision with root package name */
    public static final a f612q;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ a[] f613r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [E5.a, java.lang.Enum] */
    static {
        ?? r3 = new Enum("COROUTINE_SUSPENDED", 0);
        f612q = r3;
        f613r = new a[]{r3, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f613r.clone();
    }
}
