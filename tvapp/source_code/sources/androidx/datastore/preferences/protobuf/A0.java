package androidx.datastore.preferences.protobuf;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF12 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class A0 {

    /* renamed from: s  reason: collision with root package name */
    public static final w0 f5670s;

    /* renamed from: t  reason: collision with root package name */
    public static final x0 f5671t;

    /* renamed from: u  reason: collision with root package name */
    public static final y0 f5672u;

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ A0[] f5673v;

    /* renamed from: q  reason: collision with root package name */
    public final B0 f5674q;

    /* renamed from: r  reason: collision with root package name */
    public final int f5675r;
    /* JADX INFO: Fake field, exist only in values array */
    A0 EF10;
    /* JADX INFO: Fake field, exist only in values array */
    A0 EF11;
    /* JADX INFO: Fake field, exist only in values array */
    A0 EF12;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.preferences.protobuf.A0, androidx.datastore.preferences.protobuf.w0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.preferences.protobuf.A0, androidx.datastore.preferences.protobuf.y0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.datastore.preferences.protobuf.A0, androidx.datastore.preferences.protobuf.x0] */
    static {
        A0 a02 = new A0("DOUBLE", 0, B0.DOUBLE, 1);
        A0 a03 = new A0("FLOAT", 1, B0.FLOAT, 5);
        B0 b02 = B0.LONG;
        A0 a04 = new A0("INT64", 2, b02, 0);
        A0 a05 = new A0("UINT64", 3, b02, 0);
        B0 b03 = B0.INT;
        A0 a06 = new A0("INT32", 4, b03, 0);
        A0 a07 = new A0("FIXED64", 5, b02, 1);
        A0 a08 = new A0("FIXED32", 6, b03, 5);
        A0 a09 = new A0("BOOL", 7, B0.BOOLEAN, 0);
        ?? a010 = new A0("STRING", 8, B0.STRING, 2);
        f5670s = a010;
        B0 b04 = B0.MESSAGE;
        ?? a011 = new A0("GROUP", 9, b04, 3);
        f5671t = a011;
        ?? a012 = new A0("MESSAGE", 10, b04, 2);
        f5672u = a012;
        f5673v = new A0[]{a02, a03, a04, a05, a06, a07, a08, a09, a010, a011, a012, new A0("BYTES", 11, B0.BYTE_STRING, 2), new A0("UINT32", 12, b03, 0), new A0("ENUM", 13, B0.ENUM, 0), new A0("SFIXED32", 14, b03, 5), new A0("SFIXED64", 15, b02, 1), new A0("SINT32", 16, b03, 0), new A0("SINT64", 17, b02, 0)};
    }

    public A0(String str, int i7, B0 b02, int i8) {
        this.f5674q = b02;
        this.f5675r = i8;
    }

    public static A0 valueOf(String str) {
        return (A0) Enum.valueOf(A0.class, str);
    }

    public static A0[] values() {
        return (A0[]) f5673v.clone();
    }
}
