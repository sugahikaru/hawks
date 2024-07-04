package com.example.hawks2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
@ExtendWith(MockitoExtension.class)
class PlayerServiceTest {

        @InjectMocks
        private PlayerService playerService;

        @Mock
        private PlayerMapper playerMapper;
        @Test
        public void 存在する選手情報のIDを指定した時に正常に選手情報を取得できていること(){
            Player player = new Player(1,"柳田悠岐",9,"ソフトバンク");
            doReturn(Optional.of(player)).when(playerMapper).findById(1);
            Player actual = playerService.findPlayer(1);
            assertThat(actual).isEqualTo(player);
        }

}