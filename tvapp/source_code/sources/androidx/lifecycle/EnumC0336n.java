package androidx.lifecycle;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0336n {
    private static final /* synthetic */ EnumC0336n[] $VALUES;
    public static final C0334l Companion;
    public static final EnumC0336n ON_ANY;
    public static final EnumC0336n ON_CREATE;
    public static final EnumC0336n ON_DESTROY;
    public static final EnumC0336n ON_PAUSE;
    public static final EnumC0336n ON_RESUME;
    public static final EnumC0336n ON_START;
    public static final EnumC0336n ON_STOP;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.n] */
    static {
        ?? r7 = new Enum("ON_CREATE", 0);
        ON_CREATE = r7;
        ?? r8 = new Enum("ON_START", 1);
        ON_START = r8;
        ?? r9 = new Enum("ON_RESUME", 2);
        ON_RESUME = r9;
        ?? r10 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r10;
        ?? r11 = new Enum("ON_STOP", 4);
        ON_STOP = r11;
        ?? r12 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r12;
        ?? r13 = new Enum("ON_ANY", 6);
        ON_ANY = r13;
        $VALUES = new EnumC0336n[]{r7, r8, r9, r10, r11, r12, r13};
        Companion = new Object();
    }

    public static EnumC0336n valueOf(String str) {
        return (EnumC0336n) Enum.valueOf(EnumC0336n.class, str);
    }

    public static EnumC0336n[] values() {
        return (EnumC0336n[]) $VALUES.clone();
    }

    public final EnumC0337o a() {
        switch (AbstractC0335m.f6816a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0337o.f6819s;
            case 3:
            case 4:
                return EnumC0337o.f6820t;
            case 5:
                return EnumC0337o.f6821u;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return EnumC0337o.f6817q;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
