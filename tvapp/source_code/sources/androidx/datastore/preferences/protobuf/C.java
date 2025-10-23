package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
/* loaded from: classes.dex */
public enum C {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0228g.class, C0228g.f5760s),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: q  reason: collision with root package name */
    public final Object f5698q;

    C(Class cls, Serializable serializable) {
    }
}
