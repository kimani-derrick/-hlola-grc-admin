package Y3;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import f4.n;
import f4.o;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f4485b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public KeyStore f4486a;

    public c() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f4486a = keyStore;
        } catch (IOException | GeneralSecurityException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static boolean a(String str) {
        c cVar = new c();
        synchronized (f4485b) {
            try {
                if (!cVar.d(str)) {
                    b(str);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str) {
        String b7 = o.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b7, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized b c(String str) {
        b bVar;
        bVar = new b(o.b(str), this.f4486a);
        byte[] a7 = n.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a7, bVar.b(bVar.a(a7, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bVar;
    }

    public final synchronized boolean d(String str) {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w("c", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f4486a = keyStore;
                keyStore.load(null);
                return this.f4486a.containsAlias(str2);
            } catch (IOException e3) {
                throw new GeneralSecurityException(e3);
            }
        }
        return this.f4486a.containsAlias(o.b(str));
    }
}
