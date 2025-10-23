package d3;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class k extends j {

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f9239e;

    public k(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f9239e = bArr;
    }

    @Override // d3.j
    public final byte[] A() {
        return this.f9239e;
    }
}
