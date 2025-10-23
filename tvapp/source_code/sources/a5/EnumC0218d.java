package a5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a5.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0218d {

    /* renamed from: q  reason: collision with root package name */
    public static final EnumC0218d f5191q;

    /* renamed from: r  reason: collision with root package name */
    public static final EnumC0218d f5192r;

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ EnumC0218d[] f5193s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, a5.d] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, a5.d] */
    static {
        ?? r3 = new Enum("CRASHLYTICS", 0);
        f5191q = r3;
        ?? r42 = new Enum("PERFORMANCE", 1);
        f5192r = r42;
        f5193s = new EnumC0218d[]{r3, r42, new Enum("MATT_SAYS_HI", 2)};
    }

    public static EnumC0218d valueOf(String str) {
        return (EnumC0218d) Enum.valueOf(EnumC0218d.class, str);
    }

    public static EnumC0218d[] values() {
        return (EnumC0218d[]) f5193s.clone();
    }
}
