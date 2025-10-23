package androidx.emoji2.text;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class m {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final int f5850a;

    /* renamed from: b  reason: collision with root package name */
    public final C4.b f5851b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f5852c = 0;

    public m(C4.b bVar, int i7) {
        this.f5851b = bVar;
        this.f5850a = i7;
    }

    public final int a(int i7) {
        Z.a c5 = c();
        int a7 = c5.a(16);
        if (a7 != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) c5.f295t;
            int i8 = a7 + c5.f292q;
            return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i8) + i8 + 4);
        }
        return 0;
    }

    public final int b() {
        Z.a c5 = c();
        int a7 = c5.a(16);
        if (a7 != 0) {
            int i7 = a7 + c5.f292q;
            return ((ByteBuffer) c5.f295t).getInt(((ByteBuffer) c5.f295t).getInt(i7) + i7);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [B5.e, java.lang.Object] */
    public final Z.a c() {
        short s6;
        ThreadLocal threadLocal = d;
        Z.a aVar = (Z.a) threadLocal.get();
        Z.a aVar2 = aVar;
        if (aVar == null) {
            ?? eVar = new B5.e(2);
            threadLocal.set(eVar);
            aVar2 = eVar;
        }
        Z.b bVar = (Z.b) this.f5851b.f421r;
        int a7 = bVar.a(6);
        if (a7 != 0) {
            int i7 = a7 + bVar.f292q;
            int i8 = (this.f5850a * 4) + ((ByteBuffer) bVar.f295t).getInt(i7) + i7 + 4;
            int i9 = ((ByteBuffer) bVar.f295t).getInt(i8) + i8;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f295t;
            aVar2.f295t = byteBuffer;
            if (byteBuffer != null) {
                aVar2.f292q = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                aVar2.f293r = i10;
                s6 = ((ByteBuffer) aVar2.f295t).getShort(i10);
            } else {
                s6 = 0;
                aVar2.f292q = 0;
                aVar2.f293r = 0;
            }
            aVar2.f294s = s6;
        }
        return aVar2;
    }

    public final String toString() {
        int i7;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        Z.a c5 = c();
        int a7 = c5.a(4);
        if (a7 != 0) {
            i7 = ((ByteBuffer) c5.f295t).getInt(a7 + c5.f292q);
        } else {
            i7 = 0;
        }
        sb.append(Integer.toHexString(i7));
        sb.append(", codepoints:");
        int b7 = b();
        for (int i8 = 0; i8 < b7; i8++) {
            sb.append(Integer.toHexString(a(i8)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
