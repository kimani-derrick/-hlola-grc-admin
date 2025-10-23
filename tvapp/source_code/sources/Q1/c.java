package Q1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q  reason: collision with root package name */
    public static final c f2849q;

    /* renamed from: r  reason: collision with root package name */
    public static final c f2850r;

    /* renamed from: s  reason: collision with root package name */
    public static final c f2851s;

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ c[] f2852t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [Q1.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [Q1.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Q1.c, java.lang.Enum] */
    static {
        ?? r3 = new Enum("DEFAULT", 0);
        f2849q = r3;
        ?? r42 = new Enum("VERY_LOW", 1);
        f2850r = r42;
        ?? r5 = new Enum("HIGHEST", 2);
        f2851s = r5;
        f2852t = new c[]{r3, r42, r5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f2852t.clone();
    }
}
