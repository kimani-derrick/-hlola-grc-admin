package Y2;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public final class S extends AbstractC0138g {

    /* renamed from: A  reason: collision with root package name */
    public boolean f4348A;

    /* renamed from: u  reason: collision with root package name */
    public final Resources f4349u;

    /* renamed from: v  reason: collision with root package name */
    public final String f4350v;

    /* renamed from: w  reason: collision with root package name */
    public Uri f4351w;

    /* renamed from: x  reason: collision with root package name */
    public AssetFileDescriptor f4352x;

    /* renamed from: y  reason: collision with root package name */
    public FileInputStream f4353y;

    /* renamed from: z  reason: collision with root package name */
    public long f4354z;

    public S(Context context) {
        super(false);
        this.f4349u = context.getResources();
        this.f4350v = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i7) {
        return Uri.parse("rawresource:///" + i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r3.matches("\\d+") != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    @Override // Y2.InterfaceC0144m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(Y2.C0148q r20) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.S.c(Y2.q):long");
    }

    @Override // Y2.InterfaceC0144m
    public final void close() {
        this.f4351w = null;
        try {
            try {
                FileInputStream fileInputStream = this.f4353y;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f4353y = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f4352x;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e3) {
                        throw new C0145n(2000, null, e3);
                    }
                } finally {
                    this.f4352x = null;
                    if (this.f4348A) {
                        this.f4348A = false;
                        h();
                    }
                }
            } catch (IOException e7) {
                throw new C0145n(2000, null, e7);
            }
        } catch (Throwable th) {
            this.f4353y = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f4352x;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f4352x = null;
                    if (this.f4348A) {
                        this.f4348A = false;
                        h();
                    }
                    throw th;
                } catch (IOException e8) {
                    throw new C0145n(2000, null, e8);
                }
            } finally {
                this.f4352x = null;
                if (this.f4348A) {
                    this.f4348A = false;
                    h();
                }
            }
        }
    }

    @Override // Y2.InterfaceC0144m
    public final Uri g() {
        return this.f4351w;
    }

    @Override // Y2.InterfaceC0141j
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f4354z;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e3) {
                throw new C0145n(2000, null, e3);
            }
        }
        FileInputStream fileInputStream = this.f4353y;
        int i9 = Z2.H.f4603a;
        int read = fileInputStream.read(bArr, i7, i8);
        if (read == -1) {
            if (this.f4354z == -1) {
                return -1;
            }
            throw new C0145n(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j8 = this.f4354z;
        if (j8 != -1) {
            this.f4354z = j8 - read;
        }
        a(read);
        return read;
    }
}
