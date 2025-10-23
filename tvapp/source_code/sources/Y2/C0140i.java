package Y2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* renamed from: Y2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140i extends AbstractC0138g {

    /* renamed from: u  reason: collision with root package name */
    public final ContentResolver f4396u;

    /* renamed from: v  reason: collision with root package name */
    public Uri f4397v;

    /* renamed from: w  reason: collision with root package name */
    public AssetFileDescriptor f4398w;

    /* renamed from: x  reason: collision with root package name */
    public FileInputStream f4399x;

    /* renamed from: y  reason: collision with root package name */
    public long f4400y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4401z;

    public C0140i(Context context) {
        super(false);
        this.f4396u = context.getContentResolver();
    }

    @Override // Y2.InterfaceC0144m
    public final long c(C0148q c0148q) {
        AssetFileDescriptor openAssetFileDescriptor;
        long min;
        int i7 = 2000;
        try {
            Uri normalizeScheme = c0148q.f4422a.normalizeScheme();
            this.f4397v = normalizeScheme;
            k();
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.f4396u;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.f4398w = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f4399x = fileInputStream;
                int i8 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                long j7 = c0148q.f;
                if (i8 != 0 && j7 > length) {
                    throw new C0145n(2008, (Throwable) null);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j7) - startOffset;
                if (skip == j7) {
                    if (i8 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f4400y = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f4400y = position;
                            if (position < 0) {
                                throw new C0145n(2008, (Throwable) null);
                            }
                        }
                    } else {
                        long j8 = length - skip;
                        this.f4400y = j8;
                        if (j8 < 0) {
                            throw new C0145n(2008, (Throwable) null);
                        }
                    }
                    long j9 = c0148q.f4426g;
                    int i9 = (j9 > (-1L) ? 1 : (j9 == (-1L) ? 0 : -1));
                    if (i9 != 0) {
                        long j10 = this.f4400y;
                        if (j10 == -1) {
                            min = j9;
                        } else {
                            min = Math.min(j10, j9);
                        }
                        this.f4400y = min;
                    }
                    this.f4401z = true;
                    l(c0148q);
                    if (i9 == 0) {
                        return this.f4400y;
                    }
                    return j9;
                }
                throw new C0145n(2008, (Throwable) null);
            }
            throw new C0145n(2000, new IOException("Could not open file descriptor for: " + normalizeScheme));
        } catch (C0139h e3) {
            throw e3;
        } catch (IOException e7) {
            if (e7 instanceof FileNotFoundException) {
                i7 = 2005;
            }
            throw new C0145n(i7, e7);
        }
    }

    @Override // Y2.InterfaceC0144m
    public final void close() {
        this.f4397v = null;
        try {
            try {
                FileInputStream fileInputStream = this.f4399x;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f4399x = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f4398w;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e3) {
                        throw new C0145n(2000, e3);
                    }
                } finally {
                    this.f4398w = null;
                    if (this.f4401z) {
                        this.f4401z = false;
                        h();
                    }
                }
            } catch (IOException e7) {
                throw new C0145n(2000, e7);
            }
        } catch (Throwable th) {
            this.f4399x = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f4398w;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f4398w = null;
                    if (this.f4401z) {
                        this.f4401z = false;
                        h();
                    }
                    throw th;
                } catch (IOException e8) {
                    throw new C0145n(2000, e8);
                }
            } finally {
                this.f4398w = null;
                if (this.f4401z) {
                    this.f4401z = false;
                    h();
                }
            }
        }
    }

    @Override // Y2.InterfaceC0144m
    public final Uri g() {
        return this.f4397v;
    }

    @Override // Y2.InterfaceC0141j
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f4400y;
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
        FileInputStream fileInputStream = this.f4399x;
        int i9 = Z2.H.f4603a;
        int read = fileInputStream.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f4400y;
        if (j8 != -1) {
            this.f4400y = j8 - read;
        }
        a(read);
        return read;
    }
}
