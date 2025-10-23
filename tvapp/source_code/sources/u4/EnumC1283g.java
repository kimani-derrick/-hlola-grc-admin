package u4;

import java.util.HashMap;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u4.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1283g {

    /* renamed from: q  reason: collision with root package name */
    public static final EnumC1283g f14996q;

    /* renamed from: r  reason: collision with root package name */
    public static final HashMap f14997r;

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ EnumC1283g[] f14998s;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC1283g EF10;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, u4.g] */
    static {
        Enum r10 = new Enum("X86_32", 0);
        Enum r11 = new Enum("X86_64", 1);
        Enum r12 = new Enum("ARM_UNKNOWN", 2);
        Enum r13 = new Enum("PPC", 3);
        Enum r14 = new Enum("PPC64", 4);
        Enum r15 = new Enum("ARMV6", 5);
        Enum r5 = new Enum("ARMV7", 6);
        ?? r42 = new Enum("UNKNOWN", 7);
        f14996q = r42;
        Enum r3 = new Enum("ARMV7S", 8);
        Enum r22 = new Enum("ARM64", 9);
        f14998s = new EnumC1283g[]{r10, r11, r12, r13, r14, r15, r5, r42, r3, r22};
        HashMap hashMap = new HashMap(4);
        f14997r = hashMap;
        hashMap.put("armeabi-v7a", r5);
        hashMap.put("armeabi", r15);
        hashMap.put("arm64-v8a", r22);
        hashMap.put("x86", r10);
    }

    public static EnumC1283g valueOf(String str) {
        return (EnumC1283g) Enum.valueOf(EnumC1283g.class, str);
    }

    public static EnumC1283g[] values() {
        return (EnumC1283g[]) f14998s.clone();
    }
}
