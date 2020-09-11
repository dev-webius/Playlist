package net.webius.playlist.play;

import net.webius.playlist.util.StringUtil;

public class PlayCheckUtil {
    private final PlayServiceImpl playService;

    private final int TINYTEXT = 255;

    public PlayCheckUtil(PlayServiceImpl playService) {
        this.playService = playService;
    }

    public PlayAlertVO verifyWrite(PlayListWriteVO listWriteVO) {
        try {
            if (!StringUtil.isLimit(listWriteVO.getTitle(), TINYTEXT))
                return new PlayAlertVO("warn", "제목이 너무 깁니다.");

            if (listWriteVO.getTitle().equals(""))
                return new PlayAlertVO("warn", "제목을 입력해주세요.");

            if (playService.hasTitle(listWriteVO))
                return new PlayAlertVO("warn", "이미 존재하는 제목입니다.");
        } catch (PlayException e) {
            e.printStackTrace();
        }
        return null;
    }

    // PlayListEditVO -> PlayListWriteVO
    public PlayAlertVO verifyWrite(PlayListEditVO listEditVO) {
        return verifyWrite(new PlayListWriteVO(listEditVO.getOwner(), listEditVO.getIdx(), listEditVO.getTitle()));
    }

    public PlayAlertVO verifyNode(PlayNodeWriteVO nodeWriteVO) {
        if (!StringUtil.isLimit(nodeWriteVO.getName(), TINYTEXT))
            return new PlayAlertVO("warn", "제목이 너무 깁니다.");

        if (nodeWriteVO.getName().equals(""))
            return new PlayAlertVO("warn", "제목을 입력해주세요.");
        return null;
    }

    // PlayNodeEditVO -> PlayNodeWriteVO
    public PlayAlertVO verifyNode(PlayNodeEditVO nodeEditVO) {
        return verifyNode(new PlayNodeWriteVO(nodeEditVO.getPid(), nodeEditVO.getIdx(), nodeEditVO.getName(), nodeEditVO.getUrl(), nodeEditVO.getVid(), nodeEditVO.getThumb(), nodeEditVO.getType()));
    }
}
