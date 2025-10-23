package K2;

import Y2.C0146o;
import Y2.C0148q;
import Y2.InterfaceC0144m;
import Y2.W;
import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class a implements InterfaceC0144m {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC0144m f1646q;

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f1647r;

    /* renamed from: s  reason: collision with root package name */
    public final byte[] f1648s;

    /* renamed from: t  reason: collision with root package name */
    public CipherInputStream f1649t;

    public a(InterfaceC0144m interfaceC0144m, byte[] bArr, byte[] bArr2) {
        this.f1646q = interfaceC0144m;
        this.f1647r = bArr;
        this.f1648s = bArr2;
    }

    @Override // Y2.InterfaceC0144m
    public final long c(C0148q c0148q) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f1647r, "AES"), new IvParameterSpec(this.f1648s));
                C0146o c0146o = new C0146o(this.f1646q, c0148q);
                this.f1649t = new CipherInputStream(c0146o, cipher);
                c0146o.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // Y2.InterfaceC0144m
    public final void close() {
        if (this.f1649t != null) {
            this.f1649t = null;
            this.f1646q.close();
        }
    }

    @Override // Y2.InterfaceC0144m
    public final Uri g() {
        return this.f1646q.g();
    }

    @Override // Y2.InterfaceC0144m
    public final void m(W w7) {
        w7.getClass();
        this.f1646q.m(w7);
    }

    @Override // Y2.InterfaceC0144m
    public final Map n() {
        return this.f1646q.n();
    }

    @Override // Y2.InterfaceC0141j
    public final int r(byte[] bArr, int i7, int i8) {
        this.f1649t.getClass();
        int read = this.f1649t.read(bArr, i7, i8);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
