package t6;

import M5.g;
import w4.l0;
/* loaded from: classes.dex */
public final class a extends l0 {

    /* renamed from: a  reason: collision with root package name */
    public final d f14599a;

    public a(d dVar) {
        g.f(dVar, "trustRootIndex");
        this.f14599a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    @Override // w4.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(java.lang.String r8, java.util.List r9) {
        /*
            r7 = this;
            java.lang.String r0 = "chain"
            M5.g.f(r9, r0)
            java.lang.String r0 = "hostname"
            M5.g.f(r8, r0)
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            java.util.Collection r9 = (java.util.Collection) r9
            r8.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r0 = r8.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            M5.g.e(r0, r1)
            r9.add(r0)
            r0 = 0
            r1 = r0
        L24:
            r2 = 9
            if (r0 >= r2) goto Lb1
            int r0 = r0 + 1
            int r2 = r9.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r9.get(r2)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            t6.d r4 = r7.f14599a
            java.security.cert.X509Certificate r4 = r4.a(r2)
            if (r4 == 0) goto L66
            int r1 = r9.size()
            if (r1 > r3) goto L4a
            boolean r1 = M5.g.a(r2, r4)
            if (r1 != 0) goto L4d
        L4a:
            r9.add(r4)
        L4d:
            java.security.Principal r1 = r4.getIssuerDN()
            java.security.Principal r2 = r4.getSubjectDN()
            boolean r1 = M5.g.a(r1, r2)
            if (r1 != 0) goto L5c
            goto L64
        L5c:
            java.security.PublicKey r1 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L64
            r4.verify(r1)     // Catch: java.security.GeneralSecurityException -> L64
            return r9
        L64:
            r1 = r3
            goto L24
        L66:
            java.util.Iterator r3 = r8.iterator()
            java.lang.String r4 = "queue.iterator()"
            M5.g.e(r3, r4)
        L6f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La2
            java.lang.Object r4 = r3.next()
            if (r4 == 0) goto L9a
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            java.security.Principal r5 = r2.getIssuerDN()
            java.security.Principal r6 = r4.getSubjectDN()
            boolean r5 = M5.g.a(r5, r6)
            if (r5 != 0) goto L8c
            goto L6f
        L8c:
            java.security.PublicKey r5 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L6f
            r2.verify(r5)     // Catch: java.security.GeneralSecurityException -> L6f
            r3.remove()
            r9.add(r4)
            goto L24
        L9a:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r8.<init>(r9)
            throw r8
        La2:
            if (r1 == 0) goto La5
            return r9
        La5:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r9 = "Failed to find a trusted cert that signed "
            java.lang.String r9 = M5.g.k(r2, r9)
            r8.<init>(r9)
            throw r8
        Lb1:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r0 = "Certificate chain too long: "
            java.lang.String r9 = M5.g.k(r9, r0)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.a.d(java.lang.String, java.util.List):java.util.List");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && g.a(((a) obj).f14599a, this.f14599a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14599a.hashCode();
    }
}
