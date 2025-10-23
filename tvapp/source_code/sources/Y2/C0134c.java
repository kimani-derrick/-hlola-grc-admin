package Y2;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: Y2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134c extends AbstractC0138g {

    /* renamed from: u  reason: collision with root package name */
    public final AssetManager f4379u;

    /* renamed from: v  reason: collision with root package name */
    public Uri f4380v;

    /* renamed from: w  reason: collision with root package name */
    public InputStream f4381w;

    /* renamed from: x  reason: collision with root package name */
    public long f4382x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4383y;

    public C0134c(Context context) {
        super(false);
        this.f4379u = context.getAssets();
    }

    @Override // Y2.InterfaceC0144m
    public final long c(C0148q c0148q) {
        int i7;
        try {
            Uri uri = c0148q.f4422a;
            long j7 = c0148q.f;
            this.f4380v = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            k();
            InputStream open = this.f4379u.open(path, 1);
            this.f4381w = open;
            if (open.skip(j7) >= j7) {
                long j8 = c0148q.f4426g;
                if (j8 != -1) {
                    this.f4382x = j8;
                } else {
                    long available = this.f4381w.available();
                    this.f4382x = available;
                    if (available == 2147483647L) {
                        this.f4382x = -1L;
                    }
                }
                this.f4383y = true;
                l(c0148q);
                return this.f4382x;
            }
            throw new C0145n(2008, (Throwable) null);
        } catch (C0133b e3) {
            throw e3;
        } catch (IOException e7) {
            if (e7 instanceof FileNotFoundException) {
                i7 = 2005;
            } else {
                i7 = 2000;
            }
            throw new C0145n(i7, e7);
        }
    }

    @Override // Y2.InterfaceC0144m
    public final void close() {
        this.f4380v = null;
        try {
            try {
                InputStream inputStream = this.f4381w;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e3) {
                throw new C0145n(2000, e3);
            }
        } finally {
            this.f4381w = null;
            if (this.f4383y) {
                this.f4383y = false;
                h();
            }
        }
    }

    @Override // Y2.InterfaceC0144m
    public final Uri g() {
        return this.f4380v;
    }

    @Override // Y2.InterfaceC0141j
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f4382x;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e3) {
                throw new C0145n(2000, e3);
            }
        }
        InputStream inputStream = this.f4381w;
        int i9 = Z2.H.f4603a;
        int read = inputStream.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f4382x;
        if (j8 != -1) {
            this.f4382x = j8 - read;
        }
        a(read);
        return read;
    }
}
