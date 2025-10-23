package d5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: q  reason: collision with root package name */
    public static final o f9275q;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ o[] f9276r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, d5.o] */
    static {
        ?? r3 = new Enum("STANDARD", 0);
        f9275q = r3;
        f9276r = new o[]{r3, new Enum("CIRCULAR", 1), new Enum("CONTINUOUS", 2)};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f9276r.clone();
    }
}
