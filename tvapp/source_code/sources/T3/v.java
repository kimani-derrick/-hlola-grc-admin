package T3;

import com.google.crypto.tink.shaded.protobuf.AbstractC0523a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.B;
import e4.b0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class v implements S3.a {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f3370c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final b0 f3371a;

    /* renamed from: b  reason: collision with root package name */
    public final S3.a f3372b;

    public v(b0 b0Var, Y3.b bVar) {
        this.f3371a = b0Var;
        this.f3372b = bVar;
    }

    @Override // S3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AbstractC0523a j7;
        b0 b0Var = this.f3371a;
        AtomicReference atomicReference = S3.n.f3156a;
        synchronized (S3.n.class) {
            try {
                Z3.e eVar = ((S3.e) S3.n.f3156a.get()).a(b0Var.E()).f3139a;
                Class cls = (Class) eVar.f4705b;
                if (!((Map) eVar.f4706c).keySet().contains(cls) && !Void.class.equals(cls)) {
                    String obj = eVar.toString();
                    String name = cls.getName();
                    throw new IllegalArgumentException("Given internalKeyMananger " + obj + " does not support primitive class " + name);
                }
                if (((Boolean) S3.n.f3158c.get(b0Var.E())).booleanValue()) {
                    AbstractC0530h F = b0Var.F();
                    try {
                        P1.c g7 = eVar.g();
                        AbstractC0523a u7 = g7.u(F);
                        g7.A(u7);
                        j7 = g7.j(u7);
                    } catch (B e3) {
                        throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) eVar.g().f2765q).getName()), e3);
                    }
                } else {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.E());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] e7 = j7.e();
        byte[] a7 = this.f3372b.a(e7, f3370c);
        byte[] a8 = ((S3.a) S3.n.d(this.f3371a.E(), e7)).a(bArr, bArr2);
        return ByteBuffer.allocate(a7.length + 4 + a8.length).putInt(a7.length).put(a7).put(a8).array();
    }

    @Override // S3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i7 = wrap.getInt();
            if (i7 > 0 && i7 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i7];
                wrap.get(bArr3, 0, i7);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((S3.a) S3.n.d(this.f3371a.E(), this.f3372b.b(bArr3, f3370c))).b(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e7) {
            e = e7;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e8) {
            e = e8;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
