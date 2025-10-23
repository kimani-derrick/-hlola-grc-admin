package d0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0549b {

    /* renamed from: q  reason: collision with root package name */
    public static final EnumC0549b f9207q;

    /* renamed from: r  reason: collision with root package name */
    public static final EnumC0549b f9208r;

    /* renamed from: s  reason: collision with root package name */
    public static final EnumC0549b f9209s;

    /* renamed from: t  reason: collision with root package name */
    public static final EnumC0549b f9210t;

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ EnumC0549b[] f9211u;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC0549b EF9;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, d0.b] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, d0.b] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, d0.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, d0.b] */
    static {
        Enum r9 = new Enum("PENALTY_LOG", 0);
        Enum r10 = new Enum("PENALTY_DEATH", 1);
        ?? r11 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        f9207q = r11;
        ?? r12 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        f9208r = r12;
        ?? r13 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f9209s = r13;
        Enum r14 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        Enum r15 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        Enum r3 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        ?? r22 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f9210t = r22;
        f9211u = new EnumC0549b[]{r9, r10, r11, r12, r13, r14, r15, r3, r22};
    }

    public static EnumC0549b valueOf(String str) {
        return (EnumC0549b) Enum.valueOf(EnumC0549b.class, str);
    }

    public static EnumC0549b[] values() {
        return (EnumC0549b[]) f9211u.clone();
    }
}
