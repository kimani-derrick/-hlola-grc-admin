package com.google.android.gms.internal.measurement;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF6 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.measurement.h2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0432h2 {

    /* renamed from: r  reason: collision with root package name */
    public static final EnumC0432h2 f8572r;

    /* renamed from: s  reason: collision with root package name */
    public static final EnumC0432h2 f8573s;

    /* renamed from: t  reason: collision with root package name */
    public static final EnumC0432h2[] f8574t;

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ EnumC0432h2[] f8575u;

    /* renamed from: q  reason: collision with root package name */
    public final int f8576q;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC0432h2 EF6;

    static {
        EnumC0501v2 enumC0501v2 = EnumC0501v2.f8695u;
        EnumC0432h2 enumC0432h2 = new EnumC0432h2("DOUBLE", 0, 0, 1, enumC0501v2);
        EnumC0501v2 enumC0501v22 = EnumC0501v2.f8694t;
        EnumC0432h2 enumC0432h22 = new EnumC0432h2("FLOAT", 1, 1, 1, enumC0501v22);
        EnumC0501v2 enumC0501v23 = EnumC0501v2.f8693s;
        EnumC0432h2 enumC0432h23 = new EnumC0432h2("INT64", 2, 2, 1, enumC0501v23);
        EnumC0432h2 enumC0432h24 = new EnumC0432h2("UINT64", 3, 3, 1, enumC0501v23);
        EnumC0501v2 enumC0501v24 = EnumC0501v2.f8692r;
        EnumC0432h2 enumC0432h25 = new EnumC0432h2("INT32", 4, 4, 1, enumC0501v24);
        EnumC0432h2 enumC0432h26 = new EnumC0432h2("FIXED64", 5, 5, 1, enumC0501v23);
        EnumC0432h2 enumC0432h27 = new EnumC0432h2("FIXED32", 6, 6, 1, enumC0501v24);
        EnumC0501v2 enumC0501v25 = EnumC0501v2.f8696v;
        EnumC0432h2 enumC0432h28 = new EnumC0432h2("BOOL", 7, 7, 1, enumC0501v25);
        EnumC0501v2 enumC0501v26 = EnumC0501v2.f8697w;
        EnumC0432h2 enumC0432h29 = new EnumC0432h2("STRING", 8, 8, 1, enumC0501v26);
        EnumC0501v2 enumC0501v27 = EnumC0501v2.f8700z;
        EnumC0432h2 enumC0432h210 = new EnumC0432h2("MESSAGE", 9, 9, 1, enumC0501v27);
        EnumC0501v2 enumC0501v28 = EnumC0501v2.f8698x;
        EnumC0432h2 enumC0432h211 = new EnumC0432h2("BYTES", 10, 10, 1, enumC0501v28);
        EnumC0432h2 enumC0432h212 = new EnumC0432h2("UINT32", 11, 11, 1, enumC0501v24);
        EnumC0501v2 enumC0501v29 = EnumC0501v2.f8699y;
        EnumC0432h2 enumC0432h213 = new EnumC0432h2("ENUM", 12, 12, 1, enumC0501v29);
        EnumC0432h2 enumC0432h214 = new EnumC0432h2("SFIXED32", 13, 13, 1, enumC0501v24);
        EnumC0432h2 enumC0432h215 = new EnumC0432h2("SFIXED64", 14, 14, 1, enumC0501v23);
        EnumC0432h2 enumC0432h216 = new EnumC0432h2("SINT32", 15, 15, 1, enumC0501v24);
        EnumC0432h2 enumC0432h217 = new EnumC0432h2("SINT64", 16, 16, 1, enumC0501v23);
        EnumC0432h2 enumC0432h218 = new EnumC0432h2("GROUP", 17, 17, 1, enumC0501v27);
        EnumC0432h2 enumC0432h219 = new EnumC0432h2("DOUBLE_LIST", 18, 18, 2, enumC0501v2);
        EnumC0432h2 enumC0432h220 = new EnumC0432h2("FLOAT_LIST", 19, 19, 2, enumC0501v22);
        EnumC0432h2 enumC0432h221 = new EnumC0432h2("INT64_LIST", 20, 20, 2, enumC0501v23);
        EnumC0432h2 enumC0432h222 = new EnumC0432h2("UINT64_LIST", 21, 21, 2, enumC0501v23);
        EnumC0432h2 enumC0432h223 = new EnumC0432h2("INT32_LIST", 22, 22, 2, enumC0501v24);
        EnumC0432h2 enumC0432h224 = new EnumC0432h2("FIXED64_LIST", 23, 23, 2, enumC0501v23);
        EnumC0432h2 enumC0432h225 = new EnumC0432h2("FIXED32_LIST", 24, 24, 2, enumC0501v24);
        EnumC0432h2 enumC0432h226 = new EnumC0432h2("BOOL_LIST", 25, 25, 2, enumC0501v25);
        EnumC0432h2 enumC0432h227 = new EnumC0432h2("STRING_LIST", 26, 26, 2, enumC0501v26);
        EnumC0432h2 enumC0432h228 = new EnumC0432h2("MESSAGE_LIST", 27, 27, 2, enumC0501v27);
        EnumC0432h2 enumC0432h229 = new EnumC0432h2("BYTES_LIST", 28, 28, 2, enumC0501v28);
        EnumC0432h2 enumC0432h230 = new EnumC0432h2("UINT32_LIST", 29, 29, 2, enumC0501v24);
        EnumC0432h2 enumC0432h231 = new EnumC0432h2("ENUM_LIST", 30, 30, 2, enumC0501v29);
        EnumC0432h2 enumC0432h232 = new EnumC0432h2("SFIXED32_LIST", 31, 31, 2, enumC0501v24);
        EnumC0432h2 enumC0432h233 = new EnumC0432h2("SFIXED64_LIST", 32, 32, 2, enumC0501v23);
        EnumC0432h2 enumC0432h234 = new EnumC0432h2("SINT32_LIST", 33, 33, 2, enumC0501v24);
        EnumC0432h2 enumC0432h235 = new EnumC0432h2("SINT64_LIST", 34, 34, 2, enumC0501v23);
        EnumC0432h2 enumC0432h236 = new EnumC0432h2("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0501v2);
        f8572r = enumC0432h236;
        EnumC0432h2 enumC0432h237 = new EnumC0432h2("FLOAT_LIST_PACKED", 36, 36, 3, enumC0501v22);
        EnumC0432h2 enumC0432h238 = new EnumC0432h2("INT64_LIST_PACKED", 37, 37, 3, enumC0501v23);
        EnumC0432h2 enumC0432h239 = new EnumC0432h2("UINT64_LIST_PACKED", 38, 38, 3, enumC0501v23);
        EnumC0432h2 enumC0432h240 = new EnumC0432h2("INT32_LIST_PACKED", 39, 39, 3, enumC0501v24);
        EnumC0432h2 enumC0432h241 = new EnumC0432h2("FIXED64_LIST_PACKED", 40, 40, 3, enumC0501v23);
        EnumC0432h2 enumC0432h242 = new EnumC0432h2("FIXED32_LIST_PACKED", 41, 41, 3, enumC0501v24);
        EnumC0432h2 enumC0432h243 = new EnumC0432h2("BOOL_LIST_PACKED", 42, 42, 3, enumC0501v25);
        EnumC0432h2 enumC0432h244 = new EnumC0432h2("UINT32_LIST_PACKED", 43, 43, 3, enumC0501v24);
        EnumC0432h2 enumC0432h245 = new EnumC0432h2("ENUM_LIST_PACKED", 44, 44, 3, enumC0501v29);
        EnumC0432h2 enumC0432h246 = new EnumC0432h2("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0501v24);
        EnumC0432h2 enumC0432h247 = new EnumC0432h2("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0501v23);
        EnumC0432h2 enumC0432h248 = new EnumC0432h2("SINT32_LIST_PACKED", 47, 47, 3, enumC0501v24);
        EnumC0432h2 enumC0432h249 = new EnumC0432h2("SINT64_LIST_PACKED", 48, 48, 3, enumC0501v23);
        f8573s = enumC0432h249;
        f8575u = new EnumC0432h2[]{enumC0432h2, enumC0432h22, enumC0432h23, enumC0432h24, enumC0432h25, enumC0432h26, enumC0432h27, enumC0432h28, enumC0432h29, enumC0432h210, enumC0432h211, enumC0432h212, enumC0432h213, enumC0432h214, enumC0432h215, enumC0432h216, enumC0432h217, enumC0432h218, enumC0432h219, enumC0432h220, enumC0432h221, enumC0432h222, enumC0432h223, enumC0432h224, enumC0432h225, enumC0432h226, enumC0432h227, enumC0432h228, enumC0432h229, enumC0432h230, enumC0432h231, enumC0432h232, enumC0432h233, enumC0432h234, enumC0432h235, enumC0432h236, enumC0432h237, enumC0432h238, enumC0432h239, enumC0432h240, enumC0432h241, enumC0432h242, enumC0432h243, enumC0432h244, enumC0432h245, enumC0432h246, enumC0432h247, enumC0432h248, enumC0432h249, new EnumC0432h2("GROUP_LIST", 49, 49, 2, enumC0501v27), new EnumC0432h2("MAP", 50, 50, 4, EnumC0501v2.f8691q)};
        EnumC0432h2[] values = values();
        f8574t = new EnumC0432h2[values.length];
        for (EnumC0432h2 enumC0432h250 : values) {
            f8574t[enumC0432h250.f8576q] = enumC0432h250;
        }
    }

    public EnumC0432h2(String str, int i7, int i8, int i9, EnumC0501v2 enumC0501v2) {
        this.f8576q = i8;
        int b7 = s.h.b(i9);
        if (b7 == 1 || b7 == 3) {
            enumC0501v2.getClass();
        }
        if (i9 == 1) {
            int i10 = AbstractC0427g2.f8561a[enumC0501v2.ordinal()];
        }
    }

    public static EnumC0432h2[] values() {
        return (EnumC0432h2[]) f8575u.clone();
    }

    public final int a() {
        return this.f8576q;
    }
}
