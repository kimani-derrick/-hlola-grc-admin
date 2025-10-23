package d5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: q  reason: collision with root package name */
    public static final r f9277q;

    /* renamed from: r  reason: collision with root package name */
    public static final r f9278r;

    /* renamed from: s  reason: collision with root package name */
    public static final r f9279s;

    /* renamed from: t  reason: collision with root package name */
    public static final r f9280t;

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ r[] f9281u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, d5.r] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, d5.r] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, d5.r] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, d5.r] */
    static {
        ?? r42 = new Enum("NONE", 0);
        f9277q = r42;
        ?? r5 = new Enum("MIN", 1);
        f9278r = r5;
        ?? r62 = new Enum("MAX", 2);
        f9279s = r62;
        ?? r7 = new Enum("MIN_MAX", 3);
        f9280t = r7;
        f9281u = new r[]{r42, r5, r62, r7};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f9281u.clone();
    }
}
