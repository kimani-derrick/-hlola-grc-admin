package j2;

import Z2.AbstractC0156a;
import Z2.H;
import Z4.Q;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import e2.AbstractC0606g;
import i2.InterfaceC0770b;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: j2.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0830B implements x {

    /* renamed from: t  reason: collision with root package name */
    public static final A4.a f11759t = new A4.a(8);

    /* renamed from: q  reason: collision with root package name */
    public final UUID f11760q;

    /* renamed from: r  reason: collision with root package name */
    public final MediaDrm f11761r;

    /* renamed from: s  reason: collision with root package name */
    public int f11762s;

    public C0830B(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        AbstractC0156a.e("Use C.CLEARKEY_UUID instead", !AbstractC0606g.f9960b.equals(uuid));
        this.f11760q = uuid;
        MediaDrm mediaDrm = new MediaDrm((H.f4603a >= 27 || !AbstractC0606g.f9961c.equals(uuid)) ? uuid : uuid2);
        this.f11761r = mediaDrm;
        this.f11762s = 1;
        if (AbstractC0606g.d.equals(uuid) && "ASUS_Z00AD".equals(H.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // j2.x
    public final boolean B(String str, byte[] bArr) {
        if (H.f4603a >= 31) {
            return AbstractC0829A.a(this.f11761r, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f11760q, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // j2.x
    public final byte[] C() {
        return this.f11761r.openSession();
    }

    @Override // j2.x
    public final byte[] E(byte[] bArr, byte[] bArr2) {
        if (AbstractC0606g.f9961c.equals(this.f11760q) && H.f4603a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(H.o(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    if (i7 != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(N3.e.f2497c);
            } catch (JSONException e3) {
                AbstractC0156a.r("ClearKeyUtil", "Failed to adjust response data: ".concat(H.o(bArr2)), e3);
            }
        }
        return this.f11761r.provideKeyResponse(bArr, bArr2);
    }

    @Override // j2.x
    public final synchronized void a() {
        int i7 = this.f11762s - 1;
        this.f11762s = i7;
        if (i7 == 0) {
            this.f11761r.release();
        }
    }

    @Override // j2.x
    public final w e() {
        MediaDrm.ProvisionRequest provisionRequest = this.f11761r.getProvisionRequest();
        return new w(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // j2.x
    public final void f(byte[] bArr) {
        this.f11761r.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0196, code lost:
        if ("AFTT".equals(r7) == false) goto L29;
     */
    @Override // j2.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j2.v h(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.C0830B.h(byte[], java.util.List, int, java.util.HashMap):j2.v");
    }

    @Override // j2.x
    public final void i(final C0835d c0835d) {
        this.f11761r.setOnEventListener(new MediaDrm.OnEventListener() { // from class: j2.z
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i7, int i8, byte[] bArr2) {
                C0830B c0830b = C0830B.this;
                C0835d c0835d2 = c0835d;
                c0830b.getClass();
                Q q5 = c0835d2.f11790a.f11807N;
                q5.getClass();
                q5.obtainMessage(i7, bArr).sendToTarget();
            }
        });
    }

    @Override // j2.x
    public final void m(byte[] bArr, byte[] bArr2) {
        this.f11761r.restoreKeys(bArr, bArr2);
    }

    @Override // j2.x
    public final Map n(byte[] bArr) {
        return this.f11761r.queryKeyStatus(bArr);
    }

    @Override // j2.x
    public final int o() {
        return 2;
    }

    @Override // j2.x
    public final void p(byte[] bArr, f2.m mVar) {
        if (H.f4603a >= 31) {
            try {
                AbstractC0829A.b(this.f11761r, bArr, mVar);
            } catch (UnsupportedOperationException unused) {
                AbstractC0156a.K("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // j2.x
    public final void u(byte[] bArr) {
        this.f11761r.closeSession(bArr);
    }

    @Override // j2.x
    public final InterfaceC0770b y(byte[] bArr) {
        boolean z7;
        int i7 = H.f4603a;
        UUID uuid = this.f11760q;
        if (i7 < 21 && AbstractC0606g.d.equals(uuid) && "L3".equals(this.f11761r.getPropertyString("securityLevel"))) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (i7 < 27 && AbstractC0606g.f9961c.equals(uuid)) {
            uuid = AbstractC0606g.f9960b;
        }
        return new y(uuid, bArr, z7);
    }
}
