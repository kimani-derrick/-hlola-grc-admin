package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
/* loaded from: classes.dex */
public enum B0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0228g.f5760s),
    ENUM(null),
    MESSAGE(null);
    

    /* renamed from: q  reason: collision with root package name */
    public final Object f5686q;

    B0(Serializable serializable) {
    }
}
