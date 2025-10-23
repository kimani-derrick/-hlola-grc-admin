package androidx.lifecycle;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0337o {

    /* renamed from: q  reason: collision with root package name */
    public static final EnumC0337o f6817q;

    /* renamed from: r  reason: collision with root package name */
    public static final EnumC0337o f6818r;

    /* renamed from: s  reason: collision with root package name */
    public static final EnumC0337o f6819s;

    /* renamed from: t  reason: collision with root package name */
    public static final EnumC0337o f6820t;

    /* renamed from: u  reason: collision with root package name */
    public static final EnumC0337o f6821u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ EnumC0337o[] f6822v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    static {
        ?? r5 = new Enum("DESTROYED", 0);
        f6817q = r5;
        ?? r62 = new Enum("INITIALIZED", 1);
        f6818r = r62;
        ?? r7 = new Enum("CREATED", 2);
        f6819s = r7;
        ?? r8 = new Enum("STARTED", 3);
        f6820t = r8;
        ?? r9 = new Enum("RESUMED", 4);
        f6821u = r9;
        f6822v = new EnumC0337o[]{r5, r62, r7, r8, r9};
    }

    public static EnumC0337o valueOf(String str) {
        return (EnumC0337o) Enum.valueOf(EnumC0337o.class, str);
    }

    public static EnumC0337o[] values() {
        return (EnumC0337o[]) f6822v.clone();
    }
}
