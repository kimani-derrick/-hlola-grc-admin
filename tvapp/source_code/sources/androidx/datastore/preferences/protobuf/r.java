package androidx.datastore.preferences.protobuf;
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
/* loaded from: classes.dex */
public final class r {

    /* renamed from: r  reason: collision with root package name */
    public static final r f5808r;

    /* renamed from: s  reason: collision with root package name */
    public static final r f5809s;

    /* renamed from: t  reason: collision with root package name */
    public static final r[] f5810t;

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ r[] f5811u;

    /* renamed from: q  reason: collision with root package name */
    public final int f5812q;
    /* JADX INFO: Fake field, exist only in values array */
    r EF6;

    static {
        C c5 = C.DOUBLE;
        r rVar = new r("DOUBLE", 0, 0, 1, c5);
        C c6 = C.FLOAT;
        r rVar2 = new r("FLOAT", 1, 1, 1, c6);
        C c7 = C.LONG;
        r rVar3 = new r("INT64", 2, 2, 1, c7);
        r rVar4 = new r("UINT64", 3, 3, 1, c7);
        C c8 = C.INT;
        r rVar5 = new r("INT32", 4, 4, 1, c8);
        r rVar6 = new r("FIXED64", 5, 5, 1, c7);
        r rVar7 = new r("FIXED32", 6, 6, 1, c8);
        C c9 = C.BOOLEAN;
        r rVar8 = new r("BOOL", 7, 7, 1, c9);
        C c10 = C.STRING;
        r rVar9 = new r("STRING", 8, 8, 1, c10);
        C c11 = C.MESSAGE;
        r rVar10 = new r("MESSAGE", 9, 9, 1, c11);
        C c12 = C.BYTE_STRING;
        r rVar11 = new r("BYTES", 10, 10, 1, c12);
        r rVar12 = new r("UINT32", 11, 11, 1, c8);
        C c13 = C.ENUM;
        r rVar13 = new r("ENUM", 12, 12, 1, c13);
        r rVar14 = new r("SFIXED32", 13, 13, 1, c8);
        r rVar15 = new r("SFIXED64", 14, 14, 1, c7);
        r rVar16 = new r("SINT32", 15, 15, 1, c8);
        r rVar17 = new r("SINT64", 16, 16, 1, c7);
        r rVar18 = new r("GROUP", 17, 17, 1, c11);
        r rVar19 = new r("DOUBLE_LIST", 18, 18, 2, c5);
        r rVar20 = new r("FLOAT_LIST", 19, 19, 2, c6);
        r rVar21 = new r("INT64_LIST", 20, 20, 2, c7);
        r rVar22 = new r("UINT64_LIST", 21, 21, 2, c7);
        r rVar23 = new r("INT32_LIST", 22, 22, 2, c8);
        r rVar24 = new r("FIXED64_LIST", 23, 23, 2, c7);
        r rVar25 = new r("FIXED32_LIST", 24, 24, 2, c8);
        r rVar26 = new r("BOOL_LIST", 25, 25, 2, c9);
        r rVar27 = new r("STRING_LIST", 26, 26, 2, c10);
        r rVar28 = new r("MESSAGE_LIST", 27, 27, 2, c11);
        r rVar29 = new r("BYTES_LIST", 28, 28, 2, c12);
        r rVar30 = new r("UINT32_LIST", 29, 29, 2, c8);
        r rVar31 = new r("ENUM_LIST", 30, 30, 2, c13);
        r rVar32 = new r("SFIXED32_LIST", 31, 31, 2, c8);
        r rVar33 = new r("SFIXED64_LIST", 32, 32, 2, c7);
        r rVar34 = new r("SINT32_LIST", 33, 33, 2, c8);
        r rVar35 = new r("SINT64_LIST", 34, 34, 2, c7);
        r rVar36 = new r("DOUBLE_LIST_PACKED", 35, 35, 3, c5);
        f5808r = rVar36;
        r rVar37 = new r("FLOAT_LIST_PACKED", 36, 36, 3, c6);
        r rVar38 = new r("INT64_LIST_PACKED", 37, 37, 3, c7);
        r rVar39 = new r("UINT64_LIST_PACKED", 38, 38, 3, c7);
        r rVar40 = new r("INT32_LIST_PACKED", 39, 39, 3, c8);
        r rVar41 = new r("FIXED64_LIST_PACKED", 40, 40, 3, c7);
        r rVar42 = new r("FIXED32_LIST_PACKED", 41, 41, 3, c8);
        r rVar43 = new r("BOOL_LIST_PACKED", 42, 42, 3, c9);
        r rVar44 = new r("UINT32_LIST_PACKED", 43, 43, 3, c8);
        r rVar45 = new r("ENUM_LIST_PACKED", 44, 44, 3, c13);
        r rVar46 = new r("SFIXED32_LIST_PACKED", 45, 45, 3, c8);
        r rVar47 = new r("SFIXED64_LIST_PACKED", 46, 46, 3, c7);
        r rVar48 = new r("SINT32_LIST_PACKED", 47, 47, 3, c8);
        r rVar49 = new r("SINT64_LIST_PACKED", 48, 48, 3, c7);
        f5809s = rVar49;
        f5811u = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, rVar14, rVar15, rVar16, rVar17, rVar18, rVar19, rVar20, rVar21, rVar22, rVar23, rVar24, rVar25, rVar26, rVar27, rVar28, rVar29, rVar30, rVar31, rVar32, rVar33, rVar34, rVar35, rVar36, rVar37, rVar38, rVar39, rVar40, rVar41, rVar42, rVar43, rVar44, rVar45, rVar46, rVar47, rVar48, rVar49, new r("GROUP_LIST", 49, 49, 2, c11), new r("MAP", 50, 50, 4, C.VOID)};
        r[] values = values();
        f5810t = new r[values.length];
        for (r rVar50 : values) {
            f5810t[rVar50.f5812q] = rVar50;
        }
    }

    public r(String str, int i7, int i8, int i9, C c5) {
        this.f5812q = i8;
        int b7 = s.h.b(i9);
        if (b7 == 1 || b7 == 3) {
            c5.getClass();
        }
        if (i9 == 1) {
            c5.ordinal();
        }
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f5811u.clone();
    }

    public final int a() {
        return this.f5812q;
    }
}
