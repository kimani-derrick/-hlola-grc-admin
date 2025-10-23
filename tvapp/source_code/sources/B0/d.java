package B0;

import M5.g;
import U5.n;
import X.i;
import Z2.y;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import q6.j;
import q6.l;
/* loaded from: classes.dex */
public final class d implements C0.c, j {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f148q;

    /* renamed from: r  reason: collision with root package name */
    public String f149r;

    public d(int i7) {
        this.f148q = i7;
        switch (i7) {
            case 9:
                return;
            default:
                this.f149r = "com.google.android.gms.org.conscrypt";
                return;
        }
    }

    public static d e(y yVar) {
        String str;
        yVar.G(2);
        int u7 = yVar.u();
        int i7 = u7 >> 1;
        int u8 = ((yVar.u() >> 3) & 31) | ((u7 & 1) << 5);
        if (i7 != 4 && i7 != 5 && i7 != 7) {
            if (i7 == 8) {
                str = "hev1";
            } else if (i7 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i7);
        if (u8 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(u8);
        return new d(4, sb.toString(), false);
    }

    @Override // q6.j
    public boolean a(SSLSocket sSLSocket) {
        return n.b0(sSLSocket.getClass().getName(), g.k(".", this.f149r), false);
    }

    @Override // q6.j
    public l c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!g.a(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(g.k(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new q6.e(cls2);
    }

    public void d(StringBuilder sb, AbstractCollection abstractCollection) {
        CharSequence obj;
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                while (true) {
                    sb.append(obj);
                    if (it.hasNext()) {
                        sb.append((CharSequence) this.f149r);
                        Object next2 = it.next();
                        Objects.requireNonNull(next2);
                        if (next2 instanceof CharSequence) {
                            obj = (CharSequence) next2;
                        } else {
                            obj = next2.toString();
                        }
                    } else {
                        return;
                    }
                }
            }
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // C0.c
    public String f() {
        return this.f149r;
    }

    public String toString() {
        boolean z7;
        switch (this.f148q) {
            case 0:
                StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
                String str = this.f149r;
                sb.append(str);
                sb.append(", isKeyStoreBacked=");
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    z7 = keyStore.containsAlias(str);
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    z7 = false;
                }
                sb.append(z7);
                sb.append("}");
                return sb.toString();
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "<" + this.f149r + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i7, String str, boolean z7) {
        this.f148q = i7;
        this.f149r = str;
    }

    public d(String str, int i7) {
        this.f148q = i7;
        switch (i7) {
            case 2:
                str.getClass();
                this.f149r = str;
                return;
            default:
                g.f(str, "query");
                this.f149r = str;
                return;
        }
    }

    public d(String str, KeyGenParameterSpec keyGenParameterSpec) {
        this.f148q = 0;
        this.f149r = str;
    }

    @Override // C0.c
    public void b(C0.b bVar) {
    }
}
