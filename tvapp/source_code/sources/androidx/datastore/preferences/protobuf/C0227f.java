package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
/* renamed from: androidx.datastore.preferences.protobuf.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5759a;

    public final byte[] a(byte[] bArr, int i7, int i8) {
        switch (this.f5759a) {
            case 0:
                return Arrays.copyOfRange(bArr, i7, i8 + i7);
            default:
                byte[] bArr2 = new byte[i8];
                System.arraycopy(bArr, i7, bArr2, 0, i8);
                return bArr2;
        }
    }
}
