package androidx.datastore.preferences.protobuf;

import java.io.IOException;
/* renamed from: androidx.datastore.preferences.protobuf.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231j extends IOException {
    public C0231j(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
