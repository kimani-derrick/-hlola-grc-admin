package com.google.crypto.tink.shaded.protobuf;
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
/* renamed from: com.google.crypto.tink.shaded.protobuf.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0539q {

    /* renamed from: r  reason: collision with root package name */
    public static final EnumC0539q f9155r;

    /* renamed from: s  reason: collision with root package name */
    public static final EnumC0539q f9156s;

    /* renamed from: t  reason: collision with root package name */
    public static final EnumC0539q[] f9157t;

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ EnumC0539q[] f9158u;

    /* renamed from: q  reason: collision with root package name */
    public final int f9159q;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC0539q EF6;

    static {
        C c5 = C.DOUBLE;
        EnumC0539q enumC0539q = new EnumC0539q("DOUBLE", 0, 0, 1, c5);
        C c6 = C.FLOAT;
        EnumC0539q enumC0539q2 = new EnumC0539q("FLOAT", 1, 1, 1, c6);
        C c7 = C.LONG;
        EnumC0539q enumC0539q3 = new EnumC0539q("INT64", 2, 2, 1, c7);
        EnumC0539q enumC0539q4 = new EnumC0539q("UINT64", 3, 3, 1, c7);
        C c8 = C.INT;
        EnumC0539q enumC0539q5 = new EnumC0539q("INT32", 4, 4, 1, c8);
        EnumC0539q enumC0539q6 = new EnumC0539q("FIXED64", 5, 5, 1, c7);
        EnumC0539q enumC0539q7 = new EnumC0539q("FIXED32", 6, 6, 1, c8);
        C c9 = C.BOOLEAN;
        EnumC0539q enumC0539q8 = new EnumC0539q("BOOL", 7, 7, 1, c9);
        C c10 = C.STRING;
        EnumC0539q enumC0539q9 = new EnumC0539q("STRING", 8, 8, 1, c10);
        C c11 = C.MESSAGE;
        EnumC0539q enumC0539q10 = new EnumC0539q("MESSAGE", 9, 9, 1, c11);
        C c12 = C.BYTE_STRING;
        EnumC0539q enumC0539q11 = new EnumC0539q("BYTES", 10, 10, 1, c12);
        EnumC0539q enumC0539q12 = new EnumC0539q("UINT32", 11, 11, 1, c8);
        C c13 = C.ENUM;
        EnumC0539q enumC0539q13 = new EnumC0539q("ENUM", 12, 12, 1, c13);
        EnumC0539q enumC0539q14 = new EnumC0539q("SFIXED32", 13, 13, 1, c8);
        EnumC0539q enumC0539q15 = new EnumC0539q("SFIXED64", 14, 14, 1, c7);
        EnumC0539q enumC0539q16 = new EnumC0539q("SINT32", 15, 15, 1, c8);
        EnumC0539q enumC0539q17 = new EnumC0539q("SINT64", 16, 16, 1, c7);
        EnumC0539q enumC0539q18 = new EnumC0539q("GROUP", 17, 17, 1, c11);
        EnumC0539q enumC0539q19 = new EnumC0539q("DOUBLE_LIST", 18, 18, 2, c5);
        EnumC0539q enumC0539q20 = new EnumC0539q("FLOAT_LIST", 19, 19, 2, c6);
        EnumC0539q enumC0539q21 = new EnumC0539q("INT64_LIST", 20, 20, 2, c7);
        EnumC0539q enumC0539q22 = new EnumC0539q("UINT64_LIST", 21, 21, 2, c7);
        EnumC0539q enumC0539q23 = new EnumC0539q("INT32_LIST", 22, 22, 2, c8);
        EnumC0539q enumC0539q24 = new EnumC0539q("FIXED64_LIST", 23, 23, 2, c7);
        EnumC0539q enumC0539q25 = new EnumC0539q("FIXED32_LIST", 24, 24, 2, c8);
        EnumC0539q enumC0539q26 = new EnumC0539q("BOOL_LIST", 25, 25, 2, c9);
        EnumC0539q enumC0539q27 = new EnumC0539q("STRING_LIST", 26, 26, 2, c10);
        EnumC0539q enumC0539q28 = new EnumC0539q("MESSAGE_LIST", 27, 27, 2, c11);
        EnumC0539q enumC0539q29 = new EnumC0539q("BYTES_LIST", 28, 28, 2, c12);
        EnumC0539q enumC0539q30 = new EnumC0539q("UINT32_LIST", 29, 29, 2, c8);
        EnumC0539q enumC0539q31 = new EnumC0539q("ENUM_LIST", 30, 30, 2, c13);
        EnumC0539q enumC0539q32 = new EnumC0539q("SFIXED32_LIST", 31, 31, 2, c8);
        EnumC0539q enumC0539q33 = new EnumC0539q("SFIXED64_LIST", 32, 32, 2, c7);
        EnumC0539q enumC0539q34 = new EnumC0539q("SINT32_LIST", 33, 33, 2, c8);
        EnumC0539q enumC0539q35 = new EnumC0539q("SINT64_LIST", 34, 34, 2, c7);
        EnumC0539q enumC0539q36 = new EnumC0539q("DOUBLE_LIST_PACKED", 35, 35, 3, c5);
        f9155r = enumC0539q36;
        EnumC0539q enumC0539q37 = new EnumC0539q("FLOAT_LIST_PACKED", 36, 36, 3, c6);
        EnumC0539q enumC0539q38 = new EnumC0539q("INT64_LIST_PACKED", 37, 37, 3, c7);
        EnumC0539q enumC0539q39 = new EnumC0539q("UINT64_LIST_PACKED", 38, 38, 3, c7);
        EnumC0539q enumC0539q40 = new EnumC0539q("INT32_LIST_PACKED", 39, 39, 3, c8);
        EnumC0539q enumC0539q41 = new EnumC0539q("FIXED64_LIST_PACKED", 40, 40, 3, c7);
        EnumC0539q enumC0539q42 = new EnumC0539q("FIXED32_LIST_PACKED", 41, 41, 3, c8);
        EnumC0539q enumC0539q43 = new EnumC0539q("BOOL_LIST_PACKED", 42, 42, 3, c9);
        EnumC0539q enumC0539q44 = new EnumC0539q("UINT32_LIST_PACKED", 43, 43, 3, c8);
        EnumC0539q enumC0539q45 = new EnumC0539q("ENUM_LIST_PACKED", 44, 44, 3, c13);
        EnumC0539q enumC0539q46 = new EnumC0539q("SFIXED32_LIST_PACKED", 45, 45, 3, c8);
        EnumC0539q enumC0539q47 = new EnumC0539q("SFIXED64_LIST_PACKED", 46, 46, 3, c7);
        EnumC0539q enumC0539q48 = new EnumC0539q("SINT32_LIST_PACKED", 47, 47, 3, c8);
        EnumC0539q enumC0539q49 = new EnumC0539q("SINT64_LIST_PACKED", 48, 48, 3, c7);
        f9156s = enumC0539q49;
        f9158u = new EnumC0539q[]{enumC0539q, enumC0539q2, enumC0539q3, enumC0539q4, enumC0539q5, enumC0539q6, enumC0539q7, enumC0539q8, enumC0539q9, enumC0539q10, enumC0539q11, enumC0539q12, enumC0539q13, enumC0539q14, enumC0539q15, enumC0539q16, enumC0539q17, enumC0539q18, enumC0539q19, enumC0539q20, enumC0539q21, enumC0539q22, enumC0539q23, enumC0539q24, enumC0539q25, enumC0539q26, enumC0539q27, enumC0539q28, enumC0539q29, enumC0539q30, enumC0539q31, enumC0539q32, enumC0539q33, enumC0539q34, enumC0539q35, enumC0539q36, enumC0539q37, enumC0539q38, enumC0539q39, enumC0539q40, enumC0539q41, enumC0539q42, enumC0539q43, enumC0539q44, enumC0539q45, enumC0539q46, enumC0539q47, enumC0539q48, enumC0539q49, new EnumC0539q("GROUP_LIST", 49, 49, 2, c11), new EnumC0539q("MAP", 50, 50, 4, C.VOID)};
        EnumC0539q[] values = values();
        f9157t = new EnumC0539q[values.length];
        for (EnumC0539q enumC0539q50 : values) {
            f9157t[enumC0539q50.f9159q] = enumC0539q50;
        }
    }

    public EnumC0539q(String str, int i7, int i8, int i9, C c5) {
        this.f9159q = i8;
        int b7 = s.h.b(i9);
        if (b7 == 1 || b7 == 3) {
            c5.getClass();
        }
        if (i9 == 1) {
            c5.ordinal();
        }
    }

    public static EnumC0539q valueOf(String str) {
        return (EnumC0539q) Enum.valueOf(EnumC0539q.class, str);
    }

    public static EnumC0539q[] values() {
        return (EnumC0539q[]) f9158u.clone();
    }

    public final int a() {
        return this.f9159q;
    }
}
