package i1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: q  reason: collision with root package name */
    public static final c f11323q;

    /* renamed from: r  reason: collision with root package name */
    public static final c f11324r;

    /* renamed from: s  reason: collision with root package name */
    public static final c f11325s;

    /* renamed from: t  reason: collision with root package name */
    public static final c f11326t;

    /* renamed from: u  reason: collision with root package name */
    public static final c f11327u;

    /* renamed from: v  reason: collision with root package name */
    public static final c f11328v;

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ c[] f11329w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, i1.c] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, i1.c] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, i1.c] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, i1.c] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, i1.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, i1.c] */
    static {
        ?? r62 = new Enum("SEARCH", 0);
        f11323q = r62;
        ?? r7 = new Enum("HOME", 1);
        f11324r = r7;
        ?? r8 = new Enum("MOVIES", 2);
        f11325s = r8;
        ?? r9 = new Enum("TV_SERIES", 3);
        f11326t = r9;
        ?? r10 = new Enum("MY_LIST", 4);
        f11327u = r10;
        ?? r11 = new Enum("SETTINGS", 5);
        f11328v = r11;
        f11329w = new c[]{r62, r7, r8, r9, r10, r11};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f11329w.clone();
    }
}
