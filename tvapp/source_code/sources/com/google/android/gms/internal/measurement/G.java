package com.google.android.gms.internal.measurement;

import java.util.HashMap;
/* loaded from: classes.dex */
public enum G {
    f8314r("ADD"),
    f8316s("AND"),
    f8318t("APPLY"),
    f8320u("ASSIGN"),
    f8322v("BITWISE_AND"),
    f8324w("BITWISE_LEFT_SHIFT"),
    f8326x("BITWISE_NOT"),
    f8328y("BITWISE_OR"),
    f8329z("BITWISE_RIGHT_SHIFT"),
    f8270A("BITWISE_UNSIGNED_RIGHT_SHIFT"),
    f8272B("BITWISE_XOR"),
    f8274C("BLOCK"),
    f8276D("BREAK"),
    f8277E("CASE"),
    F("CONST"),
    f8278G("CONTINUE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("CONTROL"),
    f8279H("CREATE_ARRAY"),
    f8280I("CREATE_OBJECT"),
    f8281J("DEFAULT"),
    f8282K("DEFINE_FUNCTION"),
    f8283L("DIVIDE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("DO"),
    f8284M("EQUALS"),
    f8285N("EXPRESSION_LIST"),
    f8286O("FN"),
    f8287P("FOR_IN"),
    f8288Q("FOR_IN_CONST"),
    f8289R("FOR_IN_LET"),
    f8290S("FOR_LET"),
    f8291T("FOR_OF"),
    f8292U("FOR_OF_CONST"),
    f8293V("FOR_OF_LET"),
    W("GET"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("GET_CONTAINER_VARIABLE"),
    f8294X("GET_INDEX"),
    f8295Y("GET_PROPERTY"),
    f8296Z("GREATER_THAN"),
    f8297a0("GREATER_THAN_EQUALS"),
    f8298b0("IDENTITY_EQUALS"),
    f8299c0("IDENTITY_NOT_EQUALS"),
    f8300d0("IF"),
    f8301e0("LESS_THAN"),
    f8302f0("LESS_THAN_EQUALS"),
    f8303g0("MODULUS"),
    f8304h0("MULTIPLY"),
    f8305i0("NEGATE"),
    f8306j0("NOT"),
    f8307k0("NOT_EQUALS"),
    f8308l0("NULL"),
    f8309m0("OR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("PLUS_EQUALS"),
    f8310n0("POST_DECREMENT"),
    f8311o0("POST_INCREMENT"),
    f8312p0("QUOTE"),
    f8313q0("PRE_DECREMENT"),
    f8315r0("PRE_INCREMENT"),
    f8317s0("RETURN"),
    f8319t0("SET_PROPERTY"),
    f8321u0("SUBTRACT"),
    f8323v0("SWITCH"),
    f8325w0("TERNARY"),
    f8327x0("TYPEOF"),
    y0("UNDEFINED"),
    f8330z0("VAR"),
    f8271A0("WHILE");
    

    /* renamed from: B0  reason: collision with root package name */
    public static final HashMap f8273B0 = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    public final int f8331q;

    static {
        G[] values;
        for (G g7 : values()) {
            f8273B0.put(Integer.valueOf(g7.f8331q), g7);
        }
    }

    G(String str) {
        if (r2 <= 100) {
            this.f8331q = r2;
            return;
        }
        throw new AssertionError("Native functions over 100 are reserved for runtime implementations.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.valueOf(this.f8331q).toString();
    }
}
