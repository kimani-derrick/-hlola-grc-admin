package O4;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f2728c = {"*", "FCM", "GCM", ""};

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f2729a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2730b;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r1.isEmpty() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(h4.f r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.Context r2 = r4.f10987a
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            r3.f2729a = r0
            r4.a()
            h4.i r0 = r4.f10989c
            java.lang.String r1 = r0.f11003e
            if (r1 == 0) goto L1b
            goto L48
        L1b:
            r4.a()
            java.lang.String r4 = "1:"
            java.lang.String r1 = r0.f11001b
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            java.lang.String r4 = "2:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            goto L48
        L31:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3e
        L3c:
            r1 = r2
            goto L48
        L3e:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L48
            goto L3c
        L48:
            r3.f2730b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.<init>(h4.f):void");
    }

    public final String a() {
        String string;
        synchronized (this.f2729a) {
            string = this.f2729a.getString("|S|id", null);
        }
        return string;
    }

    public final String b() {
        PublicKey publicKey;
        synchronized (this.f2729a) {
            String str = null;
            String string = this.f2729a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e3) {
                Log.w("ContentValues", "Invalid key stored " + e3);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
