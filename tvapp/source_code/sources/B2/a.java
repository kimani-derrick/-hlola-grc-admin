package B2;

import N3.e;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p6.l;
import x2.C1461c;
import x2.C1463e;
/* loaded from: classes.dex */
public final class a extends h4.b {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f178c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a  reason: collision with root package name */
    public final CharsetDecoder f179a = e.f2497c.newDecoder();

    /* renamed from: b  reason: collision with root package name */
    public final CharsetDecoder f180b = e.f2496b.newDecoder();

    @Override // h4.b
    public final C1461c q(C1463e c1463e, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f180b;
        CharsetDecoder charsetDecoder2 = this.f179a;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new C1461c(new c(null, null, bArr));
        }
        Matcher matcher = f178c.matcher(str);
        String str3 = null;
        for (int i7 = 0; matcher.find(i7); i7 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String T6 = l.T(group);
                T6.getClass();
                if (!T6.equals("streamurl")) {
                    if (T6.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new C1461c(new c(str2, str3, bArr));
    }
}
