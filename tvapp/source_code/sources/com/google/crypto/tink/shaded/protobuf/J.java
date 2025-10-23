package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public final class J implements O {

    /* renamed from: a  reason: collision with root package name */
    public O[] f9068a;

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public final boolean a(Class cls) {
        for (O o7 : this.f9068a) {
            if (o7.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public final a0 b(Class cls) {
        O[] oArr;
        for (O o7 : this.f9068a) {
            if (o7.a(cls)) {
                return o7.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
