package q2;

import java.util.ArrayDeque;
import k.C0852F;
import k2.C0943h;
/* renamed from: q2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1106b {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13279a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f13280b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final e f13281c = new e();
    public C0852F d;

    /* renamed from: e  reason: collision with root package name */
    public int f13282e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public long f13283g;

    public final long a(C0943h c0943h, int i7) {
        byte[] bArr = this.f13279a;
        c0943h.e(bArr, 0, i7, false);
        long j7 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j7 = (j7 << 8) | (bArr[i8] & 255);
        }
        return j7;
    }
}
