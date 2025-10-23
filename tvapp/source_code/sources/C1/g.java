package C1;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: q  reason: collision with root package name */
    public static final g f368q;

    /* renamed from: r  reason: collision with root package name */
    public static final g f369r;

    /* renamed from: s  reason: collision with root package name */
    public static final g f370s;

    /* renamed from: t  reason: collision with root package name */
    public static final g f371t;

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ g[] f372u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, C1.g] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, C1.g] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, C1.g] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, C1.g] */
    static {
        ?? r42 = new Enum("INIT", 0);
        f368q = r42;
        ?? r5 = new Enum("GO_TO_HOME", 1);
        f369r = r5;
        ?? r62 = new Enum("COMMON_ERROR", 2);
        f370s = r62;
        ?? r7 = new Enum("OPEN_UPDATE", 3);
        f371t = r7;
        f372u = new g[]{r42, r5, r62, r7};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f372u.clone();
    }
}
