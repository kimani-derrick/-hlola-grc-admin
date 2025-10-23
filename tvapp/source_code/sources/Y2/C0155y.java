package Y2;

import O3.Z;
import Z2.AbstractC0156a;
import android.net.Uri;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.K1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
/* renamed from: Y2.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155y extends AbstractC0138g {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f4469A;

    /* renamed from: B  reason: collision with root package name */
    public final N3.h f4470B;

    /* renamed from: C  reason: collision with root package name */
    public HttpURLConnection f4471C;

    /* renamed from: D  reason: collision with root package name */
    public InputStream f4472D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f4473E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public long f4474G;

    /* renamed from: H  reason: collision with root package name */
    public long f4475H;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f4476u;

    /* renamed from: v  reason: collision with root package name */
    public final int f4477v;

    /* renamed from: w  reason: collision with root package name */
    public final int f4478w;

    /* renamed from: x  reason: collision with root package name */
    public final String f4479x;

    /* renamed from: y  reason: collision with root package name */
    public final K1 f4480y;

    /* renamed from: z  reason: collision with root package name */
    public final K1 f4481z;

    public C0155y(String str, int i7, int i8, K1 k12) {
        super(true);
        this.f4479x = str;
        this.f4477v = i7;
        this.f4478w = i8;
        this.f4476u = false;
        this.f4480y = k12;
        this.f4470B = null;
        this.f4481z = new K1(24);
        this.f4469A = false;
    }

    public static void w(HttpURLConnection httpURLConnection, long j7) {
        int i7;
        if (httpURLConnection != null && (i7 = Z2.H.f4603a) >= 19 && i7 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j7 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j7 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d A[Catch: IOException -> 0x0158, TRY_LEAVE, TryCatch #3 {IOException -> 0x0158, blocks: (B:57:0x0145, B:59:0x014d), top: B:117:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bd  */
    @Override // Y2.InterfaceC0144m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(Y2.C0148q r24) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0155y.c(Y2.q):long");
    }

    @Override // Y2.InterfaceC0144m
    public final void close() {
        try {
            InputStream inputStream = this.f4472D;
            if (inputStream != null) {
                long j7 = this.f4474G;
                long j8 = -1;
                if (j7 != -1) {
                    j8 = j7 - this.f4475H;
                }
                w(this.f4471C, j8);
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    int i7 = Z2.H.f4603a;
                    throw new D(e3, 2000, 3);
                }
            }
        } finally {
            this.f4472D = null;
            q();
            if (this.f4473E) {
                this.f4473E = false;
                h();
            }
        }
    }

    @Override // Y2.InterfaceC0144m
    public final Uri g() {
        HttpURLConnection httpURLConnection = this.f4471C;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // Y2.AbstractC0138g, Y2.InterfaceC0144m
    public final Map n() {
        HttpURLConnection httpURLConnection = this.f4471C;
        if (httpURLConnection == null) {
            return Z.f2634w;
        }
        return new C0154x(httpURLConnection.getHeaderFields());
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.f4471C;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e3) {
                AbstractC0156a.r("DefaultHttpDataSource", "Unexpected error while disconnecting", e3);
            }
            this.f4471C = null;
        }
    }

    @Override // Y2.InterfaceC0141j
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        try {
            long j7 = this.f4474G;
            if (j7 != -1) {
                long j8 = j7 - this.f4475H;
                if (j8 != 0) {
                    i8 = (int) Math.min(i8, j8);
                }
                return -1;
            }
            InputStream inputStream = this.f4472D;
            int i9 = Z2.H.f4603a;
            int read = inputStream.read(bArr, i7, i8);
            if (read == -1) {
                return -1;
            }
            this.f4475H += read;
            a(read);
            return read;
        } catch (IOException e3) {
            int i10 = Z2.H.f4603a;
            throw D.b(e3, 2);
        }
    }

    public final URL t(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new D(AbstractC0515y1.x("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f4476u && !protocol.equals(url.getProtocol())) {
                    throw new D("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e3) {
                throw new D(e3, 2001, 1);
            }
        }
        throw new D("Null location redirect", 2001);
    }

    public final HttpURLConnection u(C0148q c0148q) {
        boolean z7;
        HttpURLConnection v5;
        C0148q c0148q2 = c0148q;
        URL url = new URL(c0148q2.f4422a.toString());
        int i7 = 0;
        if ((c0148q2.f4428i & 1) == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean z8 = this.f4476u;
        boolean z9 = this.f4469A;
        int i8 = c0148q2.f4424c;
        byte[] bArr = c0148q2.d;
        long j7 = c0148q2.f;
        long j8 = c0148q2.f4426g;
        if (!z8 && !z9) {
            return v(url, i8, bArr, j7, j8, z7, true, c0148q2.f4425e);
        }
        URL url2 = url;
        byte[] bArr2 = bArr;
        int i9 = i8;
        while (true) {
            int i10 = i7 + 1;
            if (i7 <= 20) {
                Map map = c0148q2.f4425e;
                int i11 = i9;
                long j9 = j8;
                URL url3 = url2;
                long j10 = j7;
                v5 = v(url2, i9, bArr2, j7, j8, z7, false, map);
                int responseCode = v5.getResponseCode();
                String headerField = v5.getHeaderField("Location");
                if ((i11 != 1 && i11 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    v5.disconnect();
                    if (z9 && responseCode == 302) {
                        i9 = i11;
                    } else {
                        bArr2 = null;
                        i9 = 1;
                    }
                    url2 = t(url3, headerField);
                } else {
                    v5.disconnect();
                    url2 = t(url3, headerField);
                    i9 = i11;
                }
                c0148q2 = c0148q;
                i7 = i10;
                j8 = j9;
                j7 = j10;
            } else {
                throw new D(new NoRouteToHostException(AbstractC0515y1.l("Too many redirects: ", i10)), 2001, 1);
            }
        }
        return v5;
    }

    public final HttpURLConnection v(URL url, int i7, byte[] bArr, long j7, long j8, boolean z7, boolean z8, Map map) {
        String sb;
        String str;
        boolean z9;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f4477v);
        httpURLConnection.setReadTimeout(this.f4478w);
        HashMap hashMap = new HashMap();
        K1 k12 = this.f4480y;
        if (k12 != null) {
            hashMap.putAll(k12.B());
        }
        hashMap.putAll(this.f4481z.B());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = G.f4327a;
        if (j7 == 0 && j8 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j7);
            sb2.append("-");
            if (j8 != -1) {
                sb2.append((j7 + j8) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str3 = this.f4479x;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z7) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z8);
        if (bArr != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        httpURLConnection.setDoOutput(z9);
        int i8 = C0148q.f4421k;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    str2 = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void x(long j7) {
        if (j7 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j7 > 0) {
            InputStream inputStream = this.f4472D;
            int i7 = Z2.H.f4603a;
            int read = inputStream.read(bArr, 0, (int) Math.min(j7, 4096));
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j7 -= read;
                    a(read);
                } else {
                    throw new D();
                }
            } else {
                throw new D(new InterruptedIOException(), 2000, 1);
            }
        }
    }
}
